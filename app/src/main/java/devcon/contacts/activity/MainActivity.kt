package devcon.contacts.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import devcon.contacts.Contact
import devcon.contacts.objects.MyObjects.contactsList
import devcon.contacts.recyclerview.ContactRecyclerAdapter
import devcon.learn.contacts.R

class MainActivity : AppCompatActivity() {

    private val registerButton by lazy{findViewById<FloatingActionButton>(R.id.registerButton)}
    private val recyclerView by lazy{findViewById<RecyclerView>(R.id.contactsRecyclerView)}
    private val recyclerAdapter by lazy{
        ContactRecyclerAdapter(
            onClick = { toContactActivity(this@MainActivity,it) }
        ).apply {
            itemList = contactsList
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.run{
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        registerButton.setOnClickListener { startActivity(Intent(this, RegisterActivity::class.java)) }
    }

    override fun onResume() {
        super.onResume()
        recyclerAdapter.notifyDataSetChanged()
    }

    /** [ContactActivity] 시작 함수. 절대 다른 방법으로 ContactActivity 를 시작하지 말 것 **/
    fun toContactActivity(context: Context, targetItem: Contact){
        ContactActivity.contactToView = targetItem
        startActivity(Intent(context,ContactActivity::class.java))
    }       // intent.putExtra 쓰려면 Contact를 String으로 변환해서 넘기고 다시 Contact로 변환하는게 너무 귀찮음...
}
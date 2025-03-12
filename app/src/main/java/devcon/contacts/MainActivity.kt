package devcon.contacts

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import devcon.learn.contacts.R

class MainActivity : AppCompatActivity() {

    private val cancelButton by lazy {findViewById<Button>(R.id.cancelBtn)}
    private val saveButton by lazy {findViewById<Button>(R.id.saveBtn)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saveButton.setOnClickListener {
            Toast.makeText(this,"저장이 완료 되었습니다",Toast.LENGTH_SHORT).show()

        }
        cancelButton.setOnClickListener {
            Toast.makeText(this,"저장이 완료 되었습니다",Toast.LENGTH_SHORT).show()

        }
    }
}
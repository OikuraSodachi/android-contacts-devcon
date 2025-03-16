package devcon.contacts

import android.content.Context
import android.content.Intent
import android.widget.Toast
import devcon.contacts.activity.ContactActivity

fun toContactActivity(context: Context, targetItem: Contact) {
    ContactActivity.contactToView = targetItem
    context.startActivity(Intent(context, ContactActivity::class.java))
}       // intent.putExtra 쓰려면 Contact를 String으로 변환해서 넘기고 다시 Contact로 변환하는게 너무 귀찮음...

fun toast(context: Context, text: String) = Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
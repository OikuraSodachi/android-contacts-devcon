package devcon.contacts

data class Contact(
    val name:String,
    val contact:Long,
    val mail:String? = null,
    val birthday:String? = null,
    val gender:Boolean? = null,
    val memo:String? = null
)

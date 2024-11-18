fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {
        if (message != null) {
            val email = client?.personalInfo?.email
            if (email != null) {
                mailer.sendMessage(email = email, message)
            }
        } else return
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

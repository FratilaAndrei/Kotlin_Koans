fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
) {

    // sas3456
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

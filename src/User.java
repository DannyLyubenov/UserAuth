
public class User {

    private String name;
    private String userName;
    private String password;
    private String rePassword;
    private String question;
    private String answer;

    User () {
        name = "";
        userName = "";
        password = "";
        rePassword = "";
        question = "";
        answer = "";
    }

    User (String name , String userName,String password,String rePassword,String question,String answer) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.rePassword = rePassword;
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public String getRePassword () {
        return rePassword;
    }

    public void setRePassword (String rePassword) {
        this.rePassword = rePassword;
    }


    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String toString(){
        return name + " " + userName;
    }

}

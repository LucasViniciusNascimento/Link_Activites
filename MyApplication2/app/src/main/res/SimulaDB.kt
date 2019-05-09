package loginapp.example.fzlbpms.com.br.exampleloginapp

class AppStaticServices{
    companion object {
        public fun login(userName:String, password:String) : Boolean{
            var ret: Boolean = false
            if(userName is String && password is String){
                if (userName.equals("admin") && password.equals("admin123")){
                    ret = true;
                }
            }
            return ret;
        }
    }
}
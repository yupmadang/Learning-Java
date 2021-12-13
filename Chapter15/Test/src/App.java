public class App { /*연습문제 1번: 비밀번호 예외 클래스 만들기*/
    private String pass;

    public String getPassword(){
        return pass;
    }

    public void setPassword(String pass) throws PasswordException{ /*set메서드에서 예외 발생 조건을 설정하고 예외처리를 PasswordException클래스로 미룸*/
        if(pass == null){
            throw new PasswordException("null일 수 없습니다.");
        }

        else if(pass.matches("[a-zA-Z]+") == true){
            throw new PasswordException("문자열로만 이루어지면 안됩니다.");
        }

        else if(pass.length() <= 5){
            throw new PasswordException("5글자 이하는 안됩니다.");
        }

        else{
            this.pass = pass;
        }
    }
    
    public static void main(String[] args){
        App test = new App();
        String password = null;

        try{ /*예외처리 문장*/
            test.setPassword(password);
        }catch(PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "zxcasadsf";
        try{
            test.setPassword(password);
        }catch(PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "zxc1";
        try{
            test.setPassword(password);
        }catch(PasswordException e){
            System.out.println(e.getMessage());
        }
    }
}

public class App { /*�������� 1��: ��й�ȣ ���� Ŭ���� �����*/
    private String pass;

    public String getPassword(){
        return pass;
    }

    public void setPassword(String pass) throws PasswordException{ /*set�޼��忡�� ���� �߻� ������ �����ϰ� ����ó���� PasswordExceptionŬ������ �̷�*/
        if(pass == null){
            throw new PasswordException("null�� �� �����ϴ�.");
        }

        else if(pass.matches("[a-zA-Z]+") == true){
            throw new PasswordException("���ڿ��θ� �̷������ �ȵ˴ϴ�.");
        }

        else if(pass.length() <= 5){
            throw new PasswordException("5���� ���ϴ� �ȵ˴ϴ�.");
        }

        else{
            this.pass = pass;
        }
    }
    
    public static void main(String[] args){
        App test = new App();
        String password = null;

        try{ /*����ó�� ����*/
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

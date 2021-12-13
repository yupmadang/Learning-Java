public class App {
    private String userId;

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId) throws IdFormatException{
        if(userId == null){
            throw new IdFormatException("���̵�� null�� �� �����ϴ�.");
        }
        else if(userId.length() < 8 || userId.length() > 20){
            throw new IdFormatException("���̵�� 8���� �̻� 20���� �����Դϴ�.");
        }
        this.userId = userId;
    }
    public static void main(String[] args) throws Exception {
        App test = new App();

        String userId = null;
        try{
            test.setUserId(userId);
        }catch(IdFormatException e){
            System.out.println(e.getMessage());
        }

        userId = "1234567";
        try{
            test.setUserId(userId);
        }catch(IdFormatException e){
            System.out.println(e.getMessage());
        }
    }
}

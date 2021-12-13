public class App {
    private String userId;

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId) throws IdFormatException{
        if(userId == null){
            throw new IdFormatException("아이디는 null일 수 없습니다.");
        }
        else if(userId.length() < 8 || userId.length() > 20){
            throw new IdFormatException("아이디는 8글자 이상 20글자 이하입니다.");
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

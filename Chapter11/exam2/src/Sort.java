public interface Sort{
    void ascending(int arr[]);
    void descending(int arr[]);

    default void description(){
        System.out.println("정렬프로그램입니다. 방식을 선택하세요.");
    }
}
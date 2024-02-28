package fall_22.q5;

public class CClass extends PClass{
    void mFnc(){
        System.out.println("Hello from C class!");
        super.mFnc(11.22);
    }

    void mFnc(int a2, double d2){
        mFnc(d2);
        System.out.println("Integer value: "+a2);
    }
}

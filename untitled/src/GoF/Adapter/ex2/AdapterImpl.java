package GoF.Adapter.ex2;

public class AdapterImpl implements Adapter{
    @Override
    public Float twiceOf(Float f) {
        System.out.println("두배 함수 호출 시작");
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("반절 함수 호출 시작");
        return (float) Math.half(f.doubleValue());
    }
}

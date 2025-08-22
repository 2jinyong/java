package sec03;
// RemoteControl 인터페이스 정의
public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 1;
    
    // 추상 메서드 (기본적으로 public abstract)
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    
    // default 메서드 (인터페이스에서 기본 구현을 제공)
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음을 해제합니다.");
        }
    }
    
    // 정적 메서드 (인터페이스 이름으로 직접 호출 가능)
    static void changeBattery() {
        System.out.println("리모컨 건전지를 교체 합니다.");
    }
}
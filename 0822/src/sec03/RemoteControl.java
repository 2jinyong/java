package sec03;
// RemoteControl �������̽� ����
public interface RemoteControl {
    // ��� �ʵ�
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 1;
    
    // �߻� �޼��� (�⺻������ public abstract)
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    
    // default �޼��� (�������̽����� �⺻ ������ ����)
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("���� ó���մϴ�.");
        } else {
            System.out.println("������ �����մϴ�.");
        }
    }
    
    // ���� �޼��� (�������̽� �̸����� ���� ȣ�� ����)
    static void changeBattery() {
        System.out.println("������ �������� ��ü �մϴ�.");
    }
}
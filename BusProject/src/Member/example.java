package Member;
 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 /* 새 창을 띄워보자: JButton으로 띄우는 새 창
  * 
  * 메인 창을 구현한 후, 새 창을 다른 클래스로 만들어 버튼이 만들어질 때마다 새 창을 생성합니다.
  */
 
public class example extends JFrame {
// 버튼이 들어갈 메인 클래스
    public example() {
        
        setTitle("버튼으로 띄우는 새로운 창");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel MainContainer = new JPanel();
        setContentPane(MainContainer);
        
        JButton OpenWindow = new JButton("새 창 띄우기");
        
        OpenWindow.addActionListener(new ActionListener() {
            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new newWindow(); // 클래스 newWindow를 새로 만들어낸다
            }
            
        });
        
        MainContainer.add(OpenWindow);
        
        setSize(300,100);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new example();
    }
 
}
 
class newWindow extends JFrame {
    // 버튼이 눌러지면 만들어지는 새 창을 정의한 클래스
    newWindow() {
        setTitle("새로 띄운 창");
        // 주의, 여기서 setDefaultCloseOperation() 정의를 하지 말아야 한다
        // 정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다
        
        JPanel NewWindowContainer = new JPanel();
        setContentPane(NewWindowContainer);
        
        JLabel NewLabel = new JLabel("새 창을 띄우는데 성공!");
        
        NewWindowContainer.add(NewLabel);
        
        setSize(300,100);
        setResizable(false);
        setVisible(true);
    }
}




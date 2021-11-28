package module_26.task1;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // создаем окно
        JFrame jf = new JFrame();
        // устанавливаем ему размеры
        jf.setSize(400, 300);
        // и показываем его
        jf.setVisible(true);
        jf.addMouseListener(new SimpleClickListener());
    }
}

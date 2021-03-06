import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Botao extends JFrame {
private JButton iniciar;
private JButton parar;
private JButton resetar;
private ButtonHandler handler;

public Botao(){
        setLayout( new FlowLayout() );

        iniciar = new JButton("Iniciar");
        parar = new JButton("Parar");
        resetar = new JButton("Resetar");
        handler=new ButtonHandler(iniciar,parar,resetar);

        iniciar.addActionListener(handler);
        add(iniciar);
        parar.addActionListener(handler);
        add(parar);
        resetar.addActionListener(handler);
        add(resetar);
}

}

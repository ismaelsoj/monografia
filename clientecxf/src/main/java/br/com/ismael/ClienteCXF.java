package br.com.ismael;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

/**
 * Classe que invoca um método de um web service de forma dinâmica através de um WSDL previamente publicado.
 * 
 * @author Ismael
 * 
 */
public class ClienteCXF {

  private JFrame frame;
  private JPanel panel;
  private JPanel panelTimes;
  private JPanel panelResultado;
  private JLabel labelTime1;
  private JLabel labelTime2;
  private JTextField fieldTime1;
  private JTextField fieldTime2;
  private JLabel labelCidade;
  private JTextField fieldCidade;
  private JButton consultar;
  private JButton cancelar;

  public ClienteCXF() {
    this.frame = new JFrame("Consulta de partidas de futebol");
    this.panel = new JPanel();
    this.panelTimes = new JPanel();
    this.panelResultado = new JPanel();
    this.labelTime1 = new JLabel("Informe o time 1: ");
    this.fieldTime1 = new JTextField(30);
    this.labelTime2 = new JLabel("Informe o time 2: ");
    this.fieldTime2 = new JTextField(30);
    this.labelCidade = new JLabel("Cidade (opcional): ");
    this.fieldCidade = new JTextField(30);
    this.consultar = new JButton("Consultar Partida");
    this.cancelar = new JButton("Cancelar");
  }

  public void exibeInterfaceGrafica() {
    panel.setLayout(new BorderLayout());
    panelTimes.setLayout(new GridLayout(4, 2));
    panelTimes.add(labelTime1);
    panelTimes.add(fieldTime1);
    panelTimes.add(labelTime2);
    panelTimes.add(fieldTime2);
    panelTimes.add(labelCidade);
    panelTimes.add(fieldCidade);
    consultar.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        DynamicClientFactory factory = DynamicClientFactory.newInstance();
        // Cria o cliente através do endereço do WSDL
        Client client = factory.createClient("http://localhost:8080/webservicecxf/ConsultaPartida?wsdl");
        try {
          /*
           * Invoca o serviço através do nome da operação e informa os parâmetros necessários para a execução do mesmo
           */
          Object[] obj = client.invoke("consultaPartida", "Galo", "Cruzeiro", null);
          for (Object object : obj) {
            StringBuffer buffer = new StringBuffer();
            buffer.append("Time 1: " + ((Partida) object).getTime1());
            buffer.append("\n");
            buffer.append("Time 2: " + ((Partida) object).getTime2());
            buffer.append("\n");
            buffer.append("Resultado: " + ((Partida) object).getResultado());
            buffer.append("\n");
            buffer.append("Cidade: ");
            if (((Partida) object).getCidade() != null) {
              buffer.append(((Partida) object).getCidade());
            }
            buffer.append("\n");
            buffer.append("Motivo: " + ((Partida) object).getMotivo());
            buffer.append("\n");
            buffer.append("Informações Adicionais: " + ((Partida) object).getInformacoesAdicionais());
            JOptionPane.showMessageDialog(null, buffer.toString(), "RESULTADO DA CONSULTA",
                JOptionPane.INFORMATION_MESSAGE);
          }
        } catch (Exception e1) {
          e1.printStackTrace();
        }
      }
    });
    panelTimes.add(consultar);
    cancelar.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);

      }
    });
    panelTimes.add(cancelar);
    panel.add(panelTimes, BorderLayout.NORTH);
    panel.add(panelResultado, BorderLayout.SOUTH);
    frame.add(panel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {

    ClienteCXF cliente = new ClienteCXF();
    cliente.exibeInterfaceGrafica();

  }

}

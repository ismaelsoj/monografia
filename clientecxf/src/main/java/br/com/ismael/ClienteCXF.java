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
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

/**
 * Classe que invoca um método de um web service de forma dinâmica atrav
 * és de um WSDL previamente publicado.
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
  private JLabel labelData;
  private JTextField fieldTime1;
  private JTextField fieldTime2;
  private JTextField fieldData;
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
    this.labelData = new JLabel("Informe a data da Partida: ");
    this.fieldData = new JTextField(10);
    this.labelCidade = new JLabel("Cidade (opcional): ");
    this.fieldCidade = new JTextField(30);
    this.consultar = new JButton("Consultar Partida");
    this.cancelar = new JButton("Cancelar");
  }

  public void exibeInterfaceGrafica() {
    panel.setLayout(new BorderLayout());
    panelTimes.setLayout(new GridLayout(5, 2));
    panelTimes.add(labelTime1);
    panelTimes.add(fieldTime1);
    panelTimes.add(labelTime2);
    panelTimes.add(fieldTime2);
    panelTimes.add(labelData);
    panelTimes.add(fieldData);
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
           * Invoca o serviço através do nome da operação e 
           * informa os parâmetros necessários para a execução do mesmo
           */
          String[] dataSeparada = fieldData.getText().split("/");
          XMLGregorianCalendar dataGregorian = DatatypeFactory.newInstance().newXMLGregorianCalendar();
          dataGregorian.setDay(new Integer(dataSeparada[0]));
          dataGregorian.setMonth(new Integer(dataSeparada[1]));
          dataGregorian.setYear(new Integer(dataSeparada[2]));
          Object[] obj = client.invoke("consultaPartida", 
              fieldTime1.getText(), fieldTime2.getText(), dataGregorian,
              fieldCidade.getText());
          for (Object object : obj) {
            StringBuffer buffer = new StringBuffer();
            buffer.append("Time 1: " + ((Partida) object).getTime1());
            buffer.append("\n");
            buffer.append("Time 2: " + ((Partida) object).getTime2());
            buffer.append("\n");
            buffer.append("Data: " + ((Partida) object).getData());
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

  public JLabel getLabelData() {
    return labelData;
  }

  public void setLabelData(JLabel labelData) {
    this.labelData = labelData;
  }

  public JTextField getFieldData() {
    return fieldData;
  }

  public void setFieldData(JTextField fieldData) {
    this.fieldData = fieldData;
  }

  public JLabel getLabelTime1() {
    return labelTime1;
  }

  public void setLabelTime1(JLabel labelTime1) {
    this.labelTime1 = labelTime1;
  }

  public JLabel getLabelTime2() {
    return labelTime2;
  }

  public void setLabelTime2(JLabel labelTime2) {
    this.labelTime2 = labelTime2;
  }

  public JTextField getFieldTime1() {
    return fieldTime1;
  }

  public void setFieldTime1(JTextField fieldTime1) {
    this.fieldTime1 = fieldTime1;
  }

  public JTextField getFieldTime2() {
    return fieldTime2;
  }

  public void setFieldTime2(JTextField fieldTime2) {
    this.fieldTime2 = fieldTime2;
  }

  public JLabel getLabelCidade() {
    return labelCidade;
  }

  public void setLabelCidade(JLabel labelCidade) {
    this.labelCidade = labelCidade;
  }

  public JTextField getFieldCidade() {
    return fieldCidade;
  }

  public void setFieldCidade(JTextField fieldCidade) {
    this.fieldCidade = fieldCidade;
  }

}

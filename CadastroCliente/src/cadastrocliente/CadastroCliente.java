/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package cadastrocliente;
 import javax.swing.*;
 import java.awt.*;
/**
 *
 * @author Bruno
 */
 public class CadastroCliente extends JFrame {
     JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, cadastro;
     JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7;
   
     public CadastroCliente(){
         super("Cadastros");
        
         Container tela = getContentPane();
         setLayout(null);
        
         cadastro = new JLabel("Cadastro de Cliente");
         rotulo1 = new JLabel("Nome");
         rotulo2 = new JLabel("CPF");
         rotulo3 = new JLabel("GR");
         rotulo4 = new JLabel("Endereço");
         rotulo5 = new JLabel("Cidade");
         rotulo6 = new JLabel("Estado");
         rotulo7 = new JLabel("CEP");
        
 
         texto1 = new JTextField(20);
         texto2 = new JTextField(20);
         texto3 = new JTextField(20);
         texto4 = new JTextField(20);
         texto5 = new JTextField(20);
         texto6 = new JTextField(20);
         texto7 = new JTextField(20);
         
        
         cadastro.setBounds(130,1,220,20);
         rotulo1.setBounds(50,20,80,20);
         rotulo2.setBounds(50,60,80,20);
         rotulo3.setBounds(50,100,80,20);
         rotulo4.setBounds(50,140,80,20);
         rotulo5.setBounds(50,180,80,20);
         rotulo6.setBounds(50,220,80,20);
         rotulo7.setBounds(50,260,80,20);
                    
         texto1.setBounds(50,40,200,20);
         texto2.setBounds(50,80,100,20);
         texto3.setBounds(50,120,200,20);
         texto4.setBounds(50,160,180,20);
         texto5.setBounds(50,200,160,20);
         texto6.setBounds(50,240,120,20);
         texto7.setBounds(50,280,100,20);
           
            
         cadastro.setForeground(Color.red);
         rotulo1.setForeground(Color.black);
         rotulo2.setForeground(Color.black);
         rotulo3.setForeground(Color.black);
         rotulo4.setForeground(Color.black);
         rotulo5.setForeground(Color.black);
         rotulo6.setForeground(Color.black);
         rotulo7.setForeground(Color.black);
            
            
         cadastro.setFont(new Font("arial",Font.BOLD,17));
         rotulo1.setFont(new Font("arial",Font.BOLD,12));
         rotulo2.setFont(new Font("arial",Font.BOLD,12));
         rotulo3.setFont(new Font("arial",Font.BOLD,12));
         rotulo4.setFont(new Font("arial",Font.BOLD,12));
         rotulo5.setFont(new Font("arial",Font.BOLD,12));
         rotulo6.setFont(new Font("arial",Font.BOLD,12));
         rotulo7.setFont(new Font("arial",Font.BOLD,12));
            
 
         tela.setBackground(new Color(255,245,238));
         tela.add(cadastro);
         tela.add(rotulo1);
         tela.add(rotulo2);
         tela.add(rotulo3);
         tela.add(rotulo4);
         tela.add(rotulo5);
         tela.add(rotulo6);
         tela.add(rotulo7);
            
         tela.add(texto1);
         tela.add(texto2);
         tela.add(texto3);
         tela.add(texto4);
         tela.add(texto5);
         tela.add(texto6);
         tela.add(texto7);
            
         setSize(400, 400);
         setVisible(true);
         setLocationRelativeTo(null);
        
         ImageIcon icone = new ImageIcon("download.png");
         setIconImage(icone.getImage());
     }
   
     public static void main(String[] args) {
         CadastroCliente app = new CadastroCliente();
         app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
 }

/*     */ package Vue;
/*     */ 
/*     */ import Modele.Connexion_modele;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Color;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.util.Observable;
/*     */ import java.util.Observer;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JRootPane;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Connexion_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*     */   Connexion_modele modele;
/*     */   private JTextField adresseIP;
/*     */   private JLabel messadresse;
/*     */   private JTextField port;
/*     */   private JLabel messport;
/*     */   private JTextField pseudo;
/*     */   private JLabel messpseudo;
/*     */   private JPasswordField pass;
/*     */   private JLabel messpass;
/*     */   public JButton valider;
/*     */   public JButton retour;
/*     */   private static final long serialVersionUID = -7843466605812479973L;
/*     */ 
/*     */   public Connexion_vue(Connexion_modele modele)
/*     */   {
/*  52 */     this.modele = modele;
/*     */ 
/*  56 */     JPanel connex = new JPanel(new GridLayout(6, 1));
/*  57 */     getContentPane().add(connex, "West");
/*  58 */     setTitle("Stellinox - Connexion");
/*  59 */     setResizable(false);
/*  60 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  61 */     JPanel Titre = new JPanel(new GridLayout(1, 1));
/*  62 */     JLabel titre = new JLabel("Connexion");
/*  63 */     Font policeTitre = new Font("Arial", 1, 18);
/*  64 */     titre.setFont(policeTitre);
/*  65 */     titre.setHorizontalAlignment(0);
/*  66 */     Titre.add(titre);
/*  67 */     connex.add(Titre);
/*     */ 
/*  71 */     JPanel addresse = new JPanel(new BorderLayout());
/*  72 */     JPanel ssadress = new JPanel(new FlowLayout());
/*  73 */     this.adresseIP = new JTextField();
/*  74 */     this.adresseIP.setPreferredSize(new Dimension(30, 30));
/*  75 */     ssadress.add(this.adresseIP);
/*  76 */     this.messadresse = new JLabel("adresse de connexion :      ");
/*     */ 
/*  78 */     Font police = new Font("Arial", 1, 14);
/*  79 */     this.adresseIP.setFont(police);
/*  80 */     this.adresseIP.setPreferredSize(new Dimension(150, 30));
/*  81 */     this.adresseIP.setForeground(Color.BLUE);
/*  82 */     addresse.add(this.messadresse, "West");
/*  83 */     addresse.add(ssadress, "East");
/*  84 */     connex.add(addresse);
/*     */ 
/*  89 */     JPanel por = new JPanel(new BorderLayout());
/*  90 */     JPanel ssport = new JPanel(new FlowLayout());
/*  91 */     this.port = new JTextField();
/*  92 */     this.port.setPreferredSize(new Dimension(30, 30));
/*  93 */     ssport.add(this.port);
/*  94 */     this.messport = new JLabel("port de connexion :      ");
/*     */ 
/*  96 */     this.port.setFont(police);
/*  97 */     this.port.setPreferredSize(new Dimension(150, 30));
/*  98 */     this.port.setForeground(Color.BLUE);
/*  99 */     por.add(this.messport, "West");
/* 100 */     por.add(ssport, "East");
/* 101 */     connex.add(por);
/*     */ 
/* 106 */     JPanel pseud = new JPanel(new BorderLayout());
/* 107 */     JPanel sspseudo = new JPanel(new FlowLayout());
/* 108 */     this.pseudo = new JTextField();
/* 109 */     this.pseudo.setPreferredSize(new Dimension(30, 30));
/* 110 */     sspseudo.add(this.pseudo);
/* 111 */     this.messpseudo = new JLabel("pseudo :      ");
/*     */ 
/* 113 */     this.pseudo.setFont(police);
/* 114 */     this.pseudo.setPreferredSize(new Dimension(150, 30));
/* 115 */     this.pseudo.setForeground(Color.BLUE);
/* 116 */     pseud.add(this.messpseudo, "West");
/* 117 */     pseud.add(sspseudo, "East");
/* 118 */     connex.add(pseud);
/*     */ 
/* 124 */     JPanel mdp = new JPanel(new BorderLayout());
/* 125 */     JPanel ssmdp = new JPanel(new FlowLayout());
/* 126 */     this.pass = new JPasswordField();
/* 127 */     this.pass.setPreferredSize(new Dimension(30, 30));
/* 128 */     ssmdp.add(this.pass);
/* 129 */     this.messpass = new JLabel("mot de passe :      ");
/*     */ 
/* 131 */     this.pass.setFont(police);
/* 132 */     this.pass.setPreferredSize(new Dimension(150, 30));
/* 133 */     this.pass.setForeground(Color.BLUE);
/* 134 */     mdp.add(this.messpass, "West");
/* 135 */     mdp.add(ssmdp, "East");
/* 136 */     connex.add(mdp);
/*     */ 
/* 141 */     JPanel bouton = new JPanel(new GridLayout(1, 2));
/* 142 */     JPanel ssval = new JPanel(new FlowLayout());
/* 143 */     JPanel ssret = new JPanel(new FlowLayout());
/* 144 */     this.valider = new JButton("valider");
/* 145 */     this.retour = new JButton("Quitter");
/* 146 */     ssval.add(this.valider);
/* 147 */     ssret.add(this.retour);
/* 148 */     this.valider.setPreferredSize(new Dimension(150, 30));
/* 149 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 150 */     bouton.add(ssval);
/* 151 */     bouton.add(ssret);
/* 152 */     connex.add(bouton);
/* 153 */     this.valider.setDefaultCapable(true);
/* 154 */     getRootPane().setDefaultButton(this.valider);
/*     */ 
/* 158 */     this.adresseIP.setText("localhost");
/* 159 */     this.port.setText("5432");
/* 160 */     setDefaultCloseOperation(3);
/* 161 */     pack();
/* 162 */     setLocationRelativeTo(null);
/*     */   }
/*     */ 
/*     */   public JTextField getAdresseIP()
/*     */   {
/* 170 */     return this.adresseIP;
/*     */   }
/*     */ 
/*     */   public JTextField getPort()
/*     */   {
/* 178 */     return this.port;
/*     */   }
/*     */ 
/*     */   public JTextField getPseudo()
/*     */   {
/* 186 */     return this.pseudo;
/*     */   }
/*     */ 
/*     */   public JPasswordField getPass()
/*     */   {
/* 194 */     return this.pass;
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.Connexion_vue
 * JD-Core Version:    0.6.2
 */
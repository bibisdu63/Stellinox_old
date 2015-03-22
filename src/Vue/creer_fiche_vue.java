/*     */ package Vue;
/*     */ 
/*     */ import Modele.creer_fiche_modele;
/*     */ import java.awt.BorderLayout;
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
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class creer_fiche_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  22 */   creer_fiche_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  24 */   public JButton sauver = new JButton("Valider");
/*  25 */   public JButton retour = new JButton("Retour");
/*     */   public JLabel messcode;
/*     */   public JTextField code;
/*     */   private JTextField des;
/*     */   private JLabel messdes;
/*     */ 
/*     */   public creer_fiche_vue(creer_fiche_modele modele)
/*     */   {
/*  33 */     this.modele = modele;
/*  34 */     Observer o = this;
/*     */ 
/*  38 */     modele.addObserver(o);
/*  39 */     JPanel titre = new JPanel(new GridLayout(4, 1));
/*  40 */     getContentPane().add(titre, "Center");
/*  41 */     setTitle("Stellinox - Créer fiche");
/*  42 */     setResizable(false);
/*  43 */     setSize(600, 400);
/*  44 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  45 */     JPanel Titre = new JPanel(new FlowLayout());
/*  46 */     JLabel titr = new JLabel("Créer Fiche");
/*  47 */     titr.setPreferredSize(new Dimension(150, 30));
/*  48 */     titre.setPreferredSize(new Dimension(150, 30));
/*  49 */     Titre.setPreferredSize(new Dimension(150, 30));
/*  50 */     Font policeTitre = new Font("Arial", 1, 16);
/*  51 */     titr.setFont(policeTitre);
/*  52 */     titr.setHorizontalAlignment(0);
/*  53 */     Titre.add(titr);
/*  54 */     titre.add(Titre);
/*     */ 
/*  64 */     JPanel SurCode = new JPanel(new BorderLayout());
/*  65 */     JPanel Code = new JPanel(new FlowLayout());
/*  66 */     JPanel sscode = new JPanel(new FlowLayout());
/*  67 */     this.code = new JTextField();
/*  68 */     sscode.add(this.code);
/*  69 */     this.messcode = new JLabel("Code :      ");
/*  70 */     Font police = new Font("Arial", 1, 14);
/*  71 */     this.code.setFont(police);
/*  72 */     this.code.setPreferredSize(new Dimension(150, 30));
/*  73 */     Code.add(this.messcode);
/*  74 */     Code.add(sscode);
/*  75 */     SurCode.add(Code, "West");
/*  76 */     titre.add(SurCode);
/*     */ 
/*  82 */     JPanel Surdes = new JPanel(new BorderLayout());
/*  83 */     JPanel Des = new JPanel(new FlowLayout());
/*  84 */     JPanel ssDes = new JPanel(new FlowLayout());
/*  85 */     this.des = new JTextField();
/*  86 */     ssDes.add(this.des);
/*  87 */     this.messdes = new JLabel("Désignation :      ");
/*     */ 
/*  89 */     this.des.setFont(police);
/*  90 */     this.des.setPreferredSize(new Dimension(400, 30));
/*  91 */     Des.add(this.messdes);
/*  92 */     Des.add(ssDes);
/*  93 */     Surdes.add(Des, "West");
/*  94 */     titre.add(Surdes);
/*     */ 
/* 100 */     JPanel bouton = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 102 */     JPanel sauv = new JPanel(new FlowLayout());
/* 103 */     this.sauver.setPreferredSize(new Dimension(150, 30));
/* 104 */     sauv.add(this.sauver);
/* 105 */     bouton.add(sauv);
/*     */ 
/* 107 */     JPanel ret = new JPanel(new FlowLayout());
/* 108 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 109 */     ret.add(this.retour);
/* 110 */     bouton.add(ret);
/*     */ 
/* 112 */     titre.add(bouton);
/*     */ 
/* 114 */     setLocationRelativeTo(null);
/* 115 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/*     */   }
/*     */ 
/*     */   public JTextField getCode()
/*     */   {
/* 124 */     return this.code;
/*     */   }
/*     */ 
/*     */   public JTextField getdes() {
/* 128 */     return this.des;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.creer_fiche_vue
 * JD-Core Version:    0.6.2
 */
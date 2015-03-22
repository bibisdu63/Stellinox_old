/*     */ package Vue;
/*     */ 
/*     */ import Modele.MP_ajouter_modele;
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
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class MP_ajouter_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  24 */   MP_ajouter_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  26 */   public JButton ajout = new JButton("ajouter");
/*  27 */   public JButton retour = new JButton("Retour");
/*     */   public JLabel messcode;
/*     */   public JTextField code;
/*     */   private JTextField des;
/*     */   private JLabel messdes;
/*     */   private JLabel messuni;
/*     */   private JTextField pu;
/*     */   private JLabel messPu;
/*     */   private JComboBox<String> unite;
/*     */ 
/*     */   public MP_ajouter_vue(MP_ajouter_modele modele)
/*     */   {
/*  39 */     this.modele = modele;
/*  40 */     Observer o = this;
/*     */ 
/*  44 */     modele.addObserver(o);
/*  45 */     JPanel titre = new JPanel(new GridLayout(5, 1));
/*  46 */     getContentPane().add(titre, "Center");
/*  47 */     setTitle("Stellinox - Matières Premieres");
/*  48 */     setResizable(false);
/*  49 */     setSize(750, 400);
/*  50 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  51 */     JPanel Titre = new JPanel(new FlowLayout());
/*  52 */     JLabel titr = new JLabel("Ajouter");
/*  53 */     titr.setPreferredSize(new Dimension(150, 30));
/*  54 */     titre.setPreferredSize(new Dimension(150, 30));
/*  55 */     Titre.setPreferredSize(new Dimension(150, 30));
/*  56 */     Font policeTitre = new Font("Arial", 1, 16);
/*  57 */     titr.setFont(policeTitre);
/*  58 */     titr.setHorizontalAlignment(0);
/*  59 */     Titre.add(titr);
/*  60 */     titre.add(Titre);
/*     */ 
/*  70 */     JPanel SurCode = new JPanel(new BorderLayout());
/*  71 */     JPanel Code = new JPanel(new FlowLayout());
/*  72 */     JPanel sscode = new JPanel(new FlowLayout());
/*  73 */     this.code = new JTextField();
/*  74 */     sscode.add(this.code);
/*  75 */     this.messcode = new JLabel("Code :      ");
/*     */ 
/*  77 */     Font police = new Font("Arial", 1, 14);
/*  78 */     this.code.setFont(police);
/*  79 */     this.code.setPreferredSize(new Dimension(150, 30));
/*  80 */     Code.add(this.messcode);
/*  81 */     Code.add(sscode);
/*  82 */     SurCode.add(Code, "West");
/*  83 */     titre.add(SurCode);
/*     */ 
/*  89 */     JPanel Surdes = new JPanel(new BorderLayout());
/*  90 */     JPanel Des = new JPanel(new FlowLayout());
/*  91 */     JPanel ssDes = new JPanel(new FlowLayout());
/*  92 */     this.des = new JTextField();
/*     */ 
/*  95 */     ssDes.add(this.des);
/*  96 */     this.messdes = new JLabel("Désignation :      ");
/*     */ 
/*  98 */     this.des.setFont(police);
/*  99 */     this.des.setPreferredSize(new Dimension(400, 30));
/* 100 */     Des.add(this.messdes);
/* 101 */     Des.add(ssDes);
/* 102 */     Surdes.add(Des, "West");
/* 103 */     titre.add(Surdes);
/*     */ 
/* 110 */     JPanel Surunit = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 112 */     JPanel Aliunit = new JPanel(new BorderLayout());
/* 113 */     JPanel Unit = new JPanel(new FlowLayout());
/* 114 */     JPanel ssUnit = new JPanel(new FlowLayout());
/* 115 */     this.unite = new JComboBox();
/* 116 */     ssUnit.add(this.unite);
/* 117 */     this.unite.addItem("Pieces");
/* 118 */     this.unite.addItem("L");
/* 119 */     this.unite.addItem("ML");
/* 120 */     this.unite.addItem("KG");
/* 121 */     this.unite.addItem("M²");
/* 122 */     this.messuni = new JLabel("Unité :      ");
/*     */ 
/* 125 */     this.unite.setPreferredSize(new Dimension(120, 30));
/* 126 */     Unit.add(this.messuni);
/* 127 */     Unit.add(ssUnit);
/* 128 */     Aliunit.add(Unit, "West");
/* 129 */     Surunit.add(Aliunit);
/*     */ 
/* 131 */     JPanel Alipu = new JPanel(new BorderLayout());
/* 132 */     JPanel PU = new JPanel(new FlowLayout());
/* 133 */     JPanel ssPu = new JPanel(new FlowLayout());
/* 134 */     this.pu = new JTextField();
/* 135 */     ssPu.add(this.pu);
/* 136 */     this.messPu = new JLabel("Prix Unitaire (brut + alliage) :      ");
/*     */ 
/* 138 */     this.pu.setFont(police);
/* 139 */     this.pu.setPreferredSize(new Dimension(150, 30));
/* 140 */     PU.add(this.messPu);
/* 141 */     PU.add(ssPu);
/* 142 */     Alipu.add(PU, "West");
/* 143 */     Surunit.add(Alipu);
/*     */ 
/* 145 */     titre.add(Surunit);
/*     */ 
/* 151 */     JPanel bouton = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 153 */     JPanel sauv = new JPanel(new FlowLayout());
/* 154 */     this.ajout.setPreferredSize(new Dimension(150, 30));
/* 155 */     sauv.add(this.ajout);
/* 156 */     bouton.add(sauv);
/*     */ 
/* 158 */     JPanel ret = new JPanel(new FlowLayout());
/* 159 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 160 */     ret.add(this.retour);
/* 161 */     bouton.add(ret);
/*     */ 
/* 163 */     titre.add(bouton);
/*     */ 
/* 165 */     setLocationRelativeTo(null);
/* 166 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 174 */     return this.code.getText();
/*     */   }
/*     */ 
/*     */   public String getUnit() {
/* 178 */     return (String)this.unite.getSelectedItem();
/*     */   }
/*     */ 
/*     */   public String getPu() {
/* 182 */     return this.pu.getText();
/*     */   }
/*     */ 
/*     */   public String getDes() {
/* 186 */     return this.des.getText();
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.MP_ajouter_vue
 * JD-Core Version:    0.6.2
 */
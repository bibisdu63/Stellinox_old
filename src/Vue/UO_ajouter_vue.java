/*     */ package Vue;
/*     */ 
/*     */ import Modele.UO_ajouter_modele;
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
/*     */ public class UO_ajouter_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  24 */   UO_ajouter_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  26 */   public JButton ajout = new JButton("ajouter");
/*  27 */   public JButton retour = new JButton("Retour");
/*     */   public JLabel messcode;
/*     */   public JTextField code;
/*     */   private JTextField des;
/*     */   private JLabel messdes;
/*     */   private JLabel messuni;
/*     */   private JLabel messPu;
/*     */   private JTextField cout;
/*     */   private JLabel messcout;
/*     */   private JComboBox<String> type;
/*     */   private JComboBox<String> unite;
/*     */ 
/*     */   public UO_ajouter_vue(UO_ajouter_modele modele)
/*     */   {
/*  41 */     this.modele = modele;
/*  42 */     Observer o = this;
/*     */ 
/*  46 */     modele.addObserver(o);
/*  47 */     JPanel titre = new JPanel(new GridLayout(5, 1));
/*  48 */     getContentPane().add(titre, "Center");
/*  49 */     setTitle("Stellinox - Unités Opératoires");
/*  50 */     setResizable(false);
/*  51 */     setSize(600, 400);
/*  52 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  53 */     JPanel Titre = new JPanel(new FlowLayout());
/*  54 */     JLabel titr = new JLabel("Ajouter");
/*  55 */     titr.setPreferredSize(new Dimension(150, 30));
/*  56 */     titre.setPreferredSize(new Dimension(150, 30));
/*  57 */     Titre.setPreferredSize(new Dimension(150, 30));
/*  58 */     Font policeTitre = new Font("Arial", 1, 16);
/*  59 */     titr.setFont(policeTitre);
/*  60 */     titr.setHorizontalAlignment(0);
/*  61 */     Titre.add(titr);
/*  62 */     titre.add(Titre);
/*     */ 
/*  71 */     JPanel code_des = new JPanel(new GridLayout(1, 2));
/*  72 */     JPanel SurCode = new JPanel(new BorderLayout());
/*  73 */     JPanel Code = new JPanel(new FlowLayout());
/*  74 */     JPanel sscode = new JPanel(new FlowLayout());
/*  75 */     this.code = new JTextField();
/*  76 */     sscode.add(this.code);
/*  77 */     this.messcode = new JLabel("Code :      ");
/*     */ 
/*  79 */     Font police = new Font("Arial", 1, 14);
/*  80 */     this.code.setFont(police);
/*  81 */     this.code.setPreferredSize(new Dimension(150, 30));
/*  82 */     Code.add(this.messcode);
/*  83 */     Code.add(sscode);
/*  84 */     SurCode.add(Code, "West");
/*  85 */     code_des.add(SurCode);
/*     */ 
/*  91 */     JPanel Surdes = new JPanel(new BorderLayout());
/*  92 */     JPanel Des = new JPanel(new FlowLayout());
/*  93 */     JPanel ssDes = new JPanel(new FlowLayout());
/*  94 */     this.des = new JTextField();
/*     */ 
/*  97 */     ssDes.add(this.des);
/*  98 */     this.messdes = new JLabel("Désignation :      ");
/*     */ 
/* 100 */     this.des.setFont(police);
/* 101 */     this.des.setPreferredSize(new Dimension(150, 30));
/* 102 */     Des.add(this.messdes);
/* 103 */     Des.add(ssDes);
/* 104 */     Surdes.add(Des, "West");
/* 105 */     code_des.add(Surdes);
/* 106 */     titre.add(code_des);
/*     */ 
/* 113 */     JPanel Surunit = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 115 */     JPanel Aliunit = new JPanel(new BorderLayout());
/* 116 */     JPanel Unit = new JPanel(new FlowLayout());
/* 117 */     JPanel ssUnit = new JPanel(new FlowLayout());
/* 118 */     this.unite = new JComboBox();
/* 119 */     ssUnit.add(this.unite);
/* 120 */     this.unite.addItem("MOD");
/* 121 */     this.unite.addItem("% cout");
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
/* 134 */     this.type = new JComboBox();
/* 135 */     ssPu.add(this.type);
/* 136 */     this.type.addItem("Operation");
/* 137 */     this.type.addItem("Structure");
/* 138 */     this.messPu = new JLabel("Type :      ");
/*     */ 
/* 141 */     this.type.setPreferredSize(new Dimension(150, 30));
/* 142 */     PU.add(this.messPu);
/* 143 */     PU.add(ssPu);
/* 144 */     Alipu.add(PU, "West");
/* 145 */     Surunit.add(Alipu);
/*     */ 
/* 147 */     titre.add(Surunit);
/*     */ 
/* 154 */     JPanel Surcout = new JPanel(new BorderLayout());
/* 155 */     JPanel Cout = new JPanel(new FlowLayout());
/* 156 */     JPanel ssCout = new JPanel(new FlowLayout());
/* 157 */     this.cout = new JTextField();
/*     */ 
/* 159 */     ssCout.add(this.cout);
/* 160 */     this.messcout = new JLabel("Cout complet :      ");
/*     */ 
/* 162 */     this.cout.setFont(police);
/* 163 */     this.cout.setPreferredSize(new Dimension(150, 30));
/* 164 */     Cout.add(this.messcout);
/* 165 */     Cout.add(ssCout);
/* 166 */     Surcout.add(Cout, "West");
/* 167 */     titre.add(Surcout);
/*     */ 
/* 172 */     JPanel bouton = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 174 */     JPanel sauv = new JPanel(new FlowLayout());
/* 175 */     this.ajout.setPreferredSize(new Dimension(150, 30));
/* 176 */     sauv.add(this.ajout);
/* 177 */     bouton.add(sauv);
/*     */ 
/* 179 */     JPanel ret = new JPanel(new FlowLayout());
/* 180 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 181 */     ret.add(this.retour);
/* 182 */     bouton.add(ret);
/*     */ 
/* 184 */     titre.add(bouton);
/*     */ 
/* 186 */     setLocationRelativeTo(null);
/* 187 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 195 */     return this.code.getText();
/*     */   }
/*     */ 
/*     */   public String getUnit() {
/* 199 */     return (String)this.unite.getSelectedItem();
/*     */   }
/*     */ 
/*     */   public String getPu() {
/* 203 */     return (String)this.type.getSelectedItem();
/*     */   }
/*     */ 
/*     */   public String getDes() {
/* 207 */     return this.des.getText();
/*     */   }
/*     */ 
/*     */   public String getCout() {
/* 211 */     return this.cout.getText();
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.UO_ajouter_vue
 * JD-Core Version:    0.6.2
 */
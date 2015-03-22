/*     */ package Vue;
/*     */ 
/*     */ import Modele.UO_modifier_modele;
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
/*     */ public class UO_modifier_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  23 */   UO_modifier_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  25 */   public JButton sauver = new JButton("Enregistrer");
/*  26 */   public JButton retour = new JButton("Retour");
/*     */   public JLabel messcode;
/*     */   public JTextField code;
/*     */   private JTextField des;
/*     */   private JTextField unit;
/*     */   private JLabel messdes;
/*     */   private JLabel messuni;
/*     */   private JTextField pu;
/*     */   private JLabel messPu;
/*     */   private JTextField cout;
/*     */   private JLabel messcout;
/*  37 */   public JButton rechercher = new JButton("Rechercher");
/*     */ 
/*     */   public UO_modifier_vue(UO_modifier_modele modele)
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
/*  54 */     JLabel titr = new JLabel("Modifier");
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
/* 118 */     this.unit = new JTextField();
/* 119 */     ssUnit.add(this.unit);
/* 120 */     this.messuni = new JLabel("Unité :      ");
/*     */ 
/* 122 */     this.unit.setFont(police);
/* 123 */     this.unit.setPreferredSize(new Dimension(120, 30));
/* 124 */     Unit.add(this.messuni);
/* 125 */     Unit.add(ssUnit);
/* 126 */     Aliunit.add(Unit, "West");
/* 127 */     Surunit.add(Aliunit);
/*     */ 
/* 129 */     JPanel Alipu = new JPanel(new BorderLayout());
/* 130 */     JPanel PU = new JPanel(new FlowLayout());
/* 131 */     JPanel ssPu = new JPanel(new FlowLayout());
/* 132 */     this.pu = new JTextField();
/* 133 */     ssPu.add(this.pu);
/* 134 */     this.messPu = new JLabel("Type :      ");
/*     */ 
/* 136 */     this.pu.setFont(police);
/* 137 */     this.pu.setPreferredSize(new Dimension(150, 30));
/* 138 */     PU.add(this.messPu);
/* 139 */     PU.add(ssPu);
/* 140 */     Alipu.add(PU, "West");
/* 141 */     Surunit.add(Alipu);
/*     */ 
/* 143 */     titre.add(Surunit);
/*     */ 
/* 150 */     JPanel Surcout = new JPanel(new BorderLayout());
/* 151 */     JPanel Cout = new JPanel(new FlowLayout());
/* 152 */     JPanel ssCout = new JPanel(new FlowLayout());
/* 153 */     this.cout = new JTextField();
/*     */ 
/* 155 */     ssCout.add(this.cout);
/* 156 */     this.messcout = new JLabel("Cout complet :      ");
/*     */ 
/* 158 */     this.cout.setFont(police);
/* 159 */     this.cout.setPreferredSize(new Dimension(150, 30));
/* 160 */     Cout.add(this.messcout);
/* 161 */     Cout.add(ssCout);
/* 162 */     Surcout.add(Cout, "West");
/* 163 */     titre.add(Surcout);
/*     */ 
/* 168 */     JPanel bouton = new JPanel(new GridLayout(1, 3));
/*     */ 
/* 170 */     JPanel recher = new JPanel(new FlowLayout());
/* 171 */     this.rechercher.setPreferredSize(new Dimension(150, 30));
/* 172 */     recher.add(this.rechercher);
/* 173 */     bouton.add(recher);
/*     */ 
/* 175 */     JPanel sauv = new JPanel(new FlowLayout());
/* 176 */     this.sauver.setPreferredSize(new Dimension(150, 30));
/* 177 */     sauv.add(this.sauver);
/* 178 */     bouton.add(sauv);
/*     */ 
/* 180 */     JPanel ret = new JPanel(new FlowLayout());
/* 181 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 182 */     ret.add(this.retour);
/* 183 */     bouton.add(ret);
/*     */ 
/* 185 */     titre.add(bouton);
/*     */ 
/* 187 */     setLocationRelativeTo(null);
/* 188 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/* 193 */     this.code.setText(this.modele.getCode());
/* 194 */     this.des.setText(this.modele.getDes());
/* 195 */     this.pu.setText(this.modele.getType());
/* 196 */     this.cout.setText(this.modele.getCC());
/* 197 */     this.unit.setText(this.modele.getUnite());
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 201 */     return this.code.getText();
/*     */   }
/*     */ 
/*     */   public String getDes() {
/* 205 */     return this.des.getText();
/*     */   }
/*     */ 
/*     */   public String getUnit()
/*     */   {
/* 210 */     return this.unit.getText();
/*     */   }
/*     */ 
/*     */   public String getPu()
/*     */   {
/* 215 */     return this.pu.getText();
/*     */   }
/*     */ 
/*     */   public String getCout()
/*     */   {
/* 220 */     return this.cout.getText();
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.UO_modifier_vue
 * JD-Core Version:    0.6.2
 */
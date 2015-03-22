/*     */ package Vue;
/*     */ 
/*     */ import Modele.UO_supprimer_modele;
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
/*     */ 
/*     */ public class UO_supprimer_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  22 */   UO_supprimer_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  24 */   public JButton suppr = new JButton("Supprimer");
/*  25 */   public JButton retour = new JButton("Retour");
/*     */   public JLabel messcode;
/*     */   public JLabel code;
/*     */   private JLabel des;
/*     */   private JLabel unit;
/*     */   private JLabel messdes;
/*     */   private JLabel messuni;
/*     */   private JLabel pu;
/*     */   private JLabel messPu;
/*     */   private JLabel cout;
/*     */   private JLabel messcout;
/*  36 */   public JButton rechercher = new JButton("Rechercher");
/*     */ 
/*     */   public UO_supprimer_vue(UO_supprimer_modele modele)
/*     */   {
/*  40 */     this.modele = modele;
/*  41 */     Observer o = this;
/*     */ 
/*  45 */     modele.addObserver(o);
/*  46 */     JPanel titre = new JPanel(new GridLayout(5, 1));
/*  47 */     getContentPane().add(titre, "Center");
/*  48 */     setTitle("Stellinox - Unités Opératoires");
/*  49 */     setResizable(false);
/*  50 */     setSize(600, 400);
/*  51 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  52 */     JPanel Titre = new JPanel(new FlowLayout());
/*  53 */     JLabel titr = new JLabel("Supprimer");
/*  54 */     titr.setPreferredSize(new Dimension(150, 30));
/*  55 */     titre.setPreferredSize(new Dimension(150, 30));
/*  56 */     Titre.setPreferredSize(new Dimension(150, 30));
/*  57 */     Font policeTitre = new Font("Arial", 1, 16);
/*  58 */     titr.setFont(policeTitre);
/*  59 */     titr.setHorizontalAlignment(0);
/*  60 */     Titre.add(titr);
/*  61 */     titre.add(Titre);
/*     */ 
/*  70 */     JPanel code_des = new JPanel(new GridLayout(1, 2));
/*  71 */     JPanel SurCode = new JPanel(new BorderLayout());
/*  72 */     JPanel Code = new JPanel(new FlowLayout());
/*  73 */     JPanel sscode = new JPanel(new FlowLayout());
/*  74 */     this.code = new JLabel();
/*  75 */     sscode.add(this.code);
/*  76 */     this.messcode = new JLabel("Code :      ");
/*     */ 
/*  78 */     Font police = new Font("Arial", 1, 14);
/*  79 */     this.code.setFont(police);
/*  80 */     this.code.setPreferredSize(new Dimension(150, 30));
/*  81 */     Code.add(this.messcode);
/*  82 */     Code.add(sscode);
/*  83 */     SurCode.add(Code, "West");
/*  84 */     code_des.add(SurCode);
/*     */ 
/*  90 */     JPanel Surdes = new JPanel(new BorderLayout());
/*  91 */     JPanel Des = new JPanel(new FlowLayout());
/*  92 */     JPanel ssDes = new JPanel(new FlowLayout());
/*  93 */     this.des = new JLabel();
/*     */ 
/*  96 */     ssDes.add(this.des);
/*  97 */     this.messdes = new JLabel("Désignation :      ");
/*     */ 
/*  99 */     this.des.setFont(police);
/* 100 */     this.des.setPreferredSize(new Dimension(150, 30));
/* 101 */     Des.add(this.messdes);
/* 102 */     Des.add(ssDes);
/* 103 */     Surdes.add(Des, "West");
/* 104 */     code_des.add(Surdes);
/* 105 */     titre.add(code_des);
/*     */ 
/* 112 */     JPanel Surunit = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 114 */     JPanel Aliunit = new JPanel(new BorderLayout());
/* 115 */     JPanel Unit = new JPanel(new FlowLayout());
/* 116 */     JPanel ssUnit = new JPanel(new FlowLayout());
/* 117 */     this.unit = new JLabel();
/* 118 */     ssUnit.add(this.unit);
/* 119 */     this.messuni = new JLabel("Unité :      ");
/*     */ 
/* 121 */     this.unit.setFont(police);
/* 122 */     this.unit.setPreferredSize(new Dimension(120, 30));
/* 123 */     Unit.add(this.messuni);
/* 124 */     Unit.add(ssUnit);
/* 125 */     Aliunit.add(Unit, "West");
/* 126 */     Surunit.add(Aliunit);
/*     */ 
/* 128 */     JPanel Alipu = new JPanel(new BorderLayout());
/* 129 */     JPanel PU = new JPanel(new FlowLayout());
/* 130 */     JPanel ssPu = new JPanel(new FlowLayout());
/* 131 */     this.pu = new JLabel();
/* 132 */     ssPu.add(this.pu);
/* 133 */     this.messPu = new JLabel("Type :      ");
/*     */ 
/* 135 */     this.pu.setFont(police);
/* 136 */     this.pu.setPreferredSize(new Dimension(150, 30));
/* 137 */     PU.add(this.messPu);
/* 138 */     PU.add(ssPu);
/* 139 */     Alipu.add(PU, "West");
/* 140 */     Surunit.add(Alipu);
/*     */ 
/* 142 */     titre.add(Surunit);
/*     */ 
/* 149 */     JPanel Surcout = new JPanel(new BorderLayout());
/* 150 */     JPanel Cout = new JPanel(new FlowLayout());
/* 151 */     JPanel ssCout = new JPanel(new FlowLayout());
/* 152 */     this.cout = new JLabel();
/*     */ 
/* 154 */     ssCout.add(this.cout);
/* 155 */     this.messcout = new JLabel("Cout complet :      ");
/*     */ 
/* 157 */     this.cout.setFont(police);
/* 158 */     this.cout.setPreferredSize(new Dimension(150, 30));
/* 159 */     Cout.add(this.messcout);
/* 160 */     Cout.add(ssCout);
/* 161 */     Surcout.add(Cout, "West");
/* 162 */     titre.add(Surcout);
/*     */ 
/* 167 */     JPanel bouton = new JPanel(new GridLayout(1, 3));
/*     */ 
/* 169 */     JPanel recher = new JPanel(new FlowLayout());
/* 170 */     this.rechercher.setPreferredSize(new Dimension(150, 30));
/* 171 */     recher.add(this.rechercher);
/* 172 */     bouton.add(recher);
/*     */ 
/* 174 */     JPanel sauv = new JPanel(new FlowLayout());
/* 175 */     this.suppr.setPreferredSize(new Dimension(150, 30));
/* 176 */     sauv.add(this.suppr);
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
/* 192 */     this.code.setText(this.modele.getCode());
/* 193 */     this.des.setText(this.modele.getDes());
/* 194 */     this.pu.setText(this.modele.getType());
/* 195 */     this.cout.setText(this.modele.getCC());
/* 196 */     this.unit.setText(this.modele.getUnite());
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 200 */     return this.code.getText();
/*     */   }
/*     */ 
/*     */   public String getDes() {
/* 204 */     return this.des.getText();
/*     */   }
/*     */ 
/*     */   public String getUnit()
/*     */   {
/* 209 */     return this.unit.getText();
/*     */   }
/*     */ 
/*     */   public String getPu()
/*     */   {
/* 214 */     return this.pu.getText();
/*     */   }
/*     */ 
/*     */   public String getCout()
/*     */   {
/* 219 */     return this.cout.getText();
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.UO_supprimer_vue
 * JD-Core Version:    0.6.2
 */
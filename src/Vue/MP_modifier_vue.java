/*     */ package Vue;
/*     */ 
/*     */ import Modele.MP_modifier_modele;
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
/*     */ public class MP_modifier_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  22 */   MP_modifier_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  24 */   public JButton rechercher = new JButton("Rechercher");
/*  25 */   public JButton sauver = new JButton("Enregistrer");
/*  26 */   public JButton retour = new JButton("Retour");
/*     */   public JLabel messcode;
/*     */   public JLabel code;
/*     */   private JLabel des;
/*     */   private JTextField unit;
/*     */   private JLabel messdes;
/*     */   private JLabel messuni;
/*     */   private JTextField pu;
/*     */   private JLabel messPu;
/*     */ 
/*     */   public MP_modifier_vue(MP_modifier_modele modele)
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
/*  52 */     JLabel titr = new JLabel("Modifier");
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
/*  73 */     this.code = new JLabel();
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
/*  92 */     this.des = new JLabel();
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
/* 115 */     this.unit = new JTextField();
/* 116 */     ssUnit.add(this.unit);
/* 117 */     this.messuni = new JLabel("Unité :      ");
/*     */ 
/* 119 */     this.unit.setFont(police);
/* 120 */     this.unit.setPreferredSize(new Dimension(120, 30));
/* 121 */     Unit.add(this.messuni);
/* 122 */     Unit.add(ssUnit);
/* 123 */     Aliunit.add(Unit, "West");
/* 124 */     Surunit.add(Aliunit);
/*     */ 
/* 126 */     JPanel Alipu = new JPanel(new BorderLayout());
/* 127 */     JPanel PU = new JPanel(new FlowLayout());
/* 128 */     JPanel ssPu = new JPanel(new FlowLayout());
/* 129 */     this.pu = new JTextField();
/* 130 */     ssPu.add(this.pu);
/* 131 */     this.messPu = new JLabel("Prix Unitaire (brut + alliage) :      ");
/*     */ 
/* 133 */     this.pu.setFont(police);
/* 134 */     this.pu.setPreferredSize(new Dimension(150, 30));
/* 135 */     PU.add(this.messPu);
/* 136 */     PU.add(ssPu);
/* 137 */     Alipu.add(PU, "West");
/* 138 */     Surunit.add(Alipu);
/*     */ 
/* 140 */     titre.add(Surunit);
/*     */ 
/* 146 */     JPanel bouton = new JPanel(new GridLayout(1, 3));
/* 147 */     JPanel recher = new JPanel(new FlowLayout());
/* 148 */     this.rechercher.setPreferredSize(new Dimension(150, 30));
/* 149 */     recher.add(this.rechercher);
/* 150 */     bouton.add(recher);
/*     */ 
/* 152 */     JPanel sauv = new JPanel(new FlowLayout());
/* 153 */     this.sauver.setPreferredSize(new Dimension(150, 30));
/* 154 */     sauv.add(this.sauver);
/* 155 */     bouton.add(sauv);
/*     */ 
/* 157 */     JPanel ret = new JPanel(new FlowLayout());
/* 158 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 159 */     ret.add(this.retour);
/* 160 */     bouton.add(ret);
/*     */ 
/* 162 */     titre.add(bouton);
/*     */ 
/* 164 */     setLocationRelativeTo(null);
/* 165 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/* 170 */     this.code.setText(this.modele.getCode());
/* 171 */     this.des.setText(this.modele.getDes());
/* 172 */     this.unit.setText(this.modele.getUnite());
/* 173 */     this.pu.setText(this.modele.getPu());
/*     */   }
/*     */ 
/*     */   public JLabel getCode() {
/* 177 */     return this.code;
/*     */   }
/*     */ 
/*     */   public JTextField getUnit()
/*     */   {
/* 182 */     return this.unit;
/*     */   }
/*     */ 
/*     */   public JTextField getPu()
/*     */   {
/* 187 */     return this.pu;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.MP_modifier_vue
 * JD-Core Version:    0.6.2
 */
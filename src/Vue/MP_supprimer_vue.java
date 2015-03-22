/*     */ package Vue;
/*     */ 
/*     */ import Modele.MP_supprimer_modele;
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
/*     */ public class MP_supprimer_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*  21 */   MP_supprimer_modele modele = null;
/*     */   private static final long serialVersionUID = -1176336551953390004L;
/*  23 */   public JButton rechercher = new JButton("Rechercher");
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
/*     */ 
/*     */   public MP_supprimer_vue(MP_supprimer_modele modele)
/*     */   {
/*  37 */     this.modele = modele;
/*  38 */     Observer o = this;
/*     */ 
/*  42 */     modele.addObserver(o);
/*  43 */     JPanel titre = new JPanel(new GridLayout(5, 1));
/*  44 */     getContentPane().add(titre, "Center");
/*  45 */     setTitle("Stellinox - Matières Premieres");
/*  46 */     setResizable(false);
/*  47 */     setSize(600, 400);
/*  48 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*  49 */     JPanel Titre = new JPanel(new FlowLayout());
/*  50 */     JLabel titr = new JLabel("Supprimer");
/*  51 */     titr.setPreferredSize(new Dimension(150, 30));
/*  52 */     titre.setPreferredSize(new Dimension(150, 30));
/*  53 */     Titre.setPreferredSize(new Dimension(150, 30));
/*  54 */     Font policeTitre = new Font("Arial", 1, 16);
/*  55 */     titr.setFont(policeTitre);
/*  56 */     titr.setHorizontalAlignment(0);
/*  57 */     Titre.add(titr);
/*  58 */     titre.add(Titre);
/*     */ 
/*  68 */     JPanel SurCode = new JPanel(new BorderLayout());
/*  69 */     JPanel Code = new JPanel(new FlowLayout());
/*  70 */     JPanel sscode = new JPanel(new FlowLayout());
/*  71 */     this.code = new JLabel();
/*  72 */     sscode.add(this.code);
/*  73 */     this.messcode = new JLabel("Code :      ");
/*     */ 
/*  75 */     Font police = new Font("Arial", 1, 14);
/*  76 */     this.code.setFont(police);
/*  77 */     this.code.setPreferredSize(new Dimension(150, 30));
/*  78 */     Code.add(this.messcode);
/*  79 */     Code.add(sscode);
/*  80 */     SurCode.add(Code, "West");
/*  81 */     titre.add(SurCode);
/*     */ 
/*  87 */     JPanel Surdes = new JPanel(new BorderLayout());
/*  88 */     JPanel Des = new JPanel(new FlowLayout());
/*  89 */     JPanel ssDes = new JPanel(new FlowLayout());
/*  90 */     this.des = new JLabel();
/*     */ 
/*  93 */     ssDes.add(this.des);
/*  94 */     this.messdes = new JLabel("Désignation :      ");
/*     */ 
/*  96 */     this.des.setFont(police);
/*  97 */     this.des.setPreferredSize(new Dimension(400, 30));
/*  98 */     Des.add(this.messdes);
/*  99 */     Des.add(ssDes);
/* 100 */     Surdes.add(Des, "West");
/* 101 */     titre.add(Surdes);
/*     */ 
/* 108 */     JPanel Surunit = new JPanel(new GridLayout(1, 2));
/*     */ 
/* 110 */     JPanel Aliunit = new JPanel(new BorderLayout());
/* 111 */     JPanel Unit = new JPanel(new FlowLayout());
/* 112 */     JPanel ssUnit = new JPanel(new FlowLayout());
/* 113 */     this.unit = new JLabel();
/* 114 */     ssUnit.add(this.unit);
/* 115 */     this.messuni = new JLabel("Unité :      ");
/*     */ 
/* 117 */     this.unit.setFont(police);
/* 118 */     this.unit.setPreferredSize(new Dimension(120, 30));
/* 119 */     Unit.add(this.messuni);
/* 120 */     Unit.add(ssUnit);
/* 121 */     Aliunit.add(Unit, "West");
/* 122 */     Surunit.add(Aliunit);
/*     */ 
/* 124 */     JPanel Alipu = new JPanel(new BorderLayout());
/* 125 */     JPanel PU = new JPanel(new FlowLayout());
/* 126 */     JPanel ssPu = new JPanel(new FlowLayout());
/* 127 */     this.pu = new JLabel();
/* 128 */     ssPu.add(this.pu);
/* 129 */     this.messPu = new JLabel("Prix Unitaire :      ");
/*     */ 
/* 131 */     this.pu.setFont(police);
/* 132 */     this.pu.setPreferredSize(new Dimension(150, 30));
/* 133 */     PU.add(this.messPu);
/* 134 */     PU.add(ssPu);
/* 135 */     Alipu.add(PU, "West");
/* 136 */     Surunit.add(Alipu);
/*     */ 
/* 138 */     titre.add(Surunit);
/*     */ 
/* 144 */     JPanel bouton = new JPanel(new GridLayout(1, 3));
/* 145 */     JPanel recher = new JPanel(new FlowLayout());
/* 146 */     this.rechercher.setPreferredSize(new Dimension(150, 30));
/* 147 */     recher.add(this.rechercher);
/* 148 */     bouton.add(recher);
/*     */ 
/* 150 */     JPanel sup = new JPanel(new FlowLayout());
/* 151 */     this.suppr.setPreferredSize(new Dimension(150, 30));
/* 152 */     sup.add(this.suppr);
/* 153 */     bouton.add(sup);
/*     */ 
/* 155 */     JPanel ret = new JPanel(new FlowLayout());
/* 156 */     this.retour.setPreferredSize(new Dimension(150, 30));
/* 157 */     ret.add(this.retour);
/* 158 */     bouton.add(ret);
/*     */ 
/* 160 */     titre.add(bouton);
/*     */ 
/* 162 */     setLocationRelativeTo(null);
/* 163 */     setVisible(true);
/*     */   }
/*     */ 
/*     */   public String getCode() {
/* 167 */     return this.code.getText();
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/* 172 */     this.code.setText(this.modele.getCode());
/* 173 */     this.des.setText(this.modele.getDes());
/* 174 */     this.unit.setText(this.modele.getUnite());
/* 175 */     this.pu.setText(this.modele.getPu());
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.MP_supprimer_vue
 * JD-Core Version:    0.6.2
 */
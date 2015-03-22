/*     */ package Vue;
/*     */ 
/*     */ import Modele.MP;
/*     */ import Modele.UO;
/*     */ import Modele.list_MP_modele;
/*     */ import Modele.list_UO_modele;
/*     */ import Modele.modifier_fiche_modele;
/*     */ import java.awt.BorderLayout;
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.FlowLayout;
/*     */ import java.awt.Font;
/*     */ import java.awt.GridLayout;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Observable;
/*     */ import java.util.Observer;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTabbedPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class modifier_fiche_vue extends JFrame
/*     */   implements Observer
/*     */ {
/*     */   private static final long serialVersionUID = -9110372778543770638L;
/*  35 */   modifier_fiche_modele modele = null;
/*     */   private JButton ajouter;
/*     */   public JButton retour;
/*     */   private JButton supprimer;
/*     */   private list_MP_modele modele_list;
/*     */   private JTable tableau;
/*     */   private JTextField code;
/*     */   private JLabel messcode;
/*     */   private JTextArea des;
/*     */   private JLabel messdes;
/*     */   private list_UO_modele modele_list_uo;
/*     */   private JPanel button1;
/*     */   private JPanel ssbut1;
/*     */   private JButton supprimer_uo;
/*     */   private JButton ajouter_uo;
/*     */   private JTable tableau_uo;
/*     */   public JButton retour_uo;
/*     */   public JButton sauver;
/*     */   public JButton retour_g;
/*     */   private JPanel button_g;
/*     */   private JPanel ssbut_g;
/*     */ 
/*     */   public modifier_fiche_vue(modifier_fiche_modele modele)
/*     */   {
/*  59 */     this.modele = modele;
/*     */ 
/*  61 */     String result = JOptionPane.showInputDialog(this, "entrez le code à rechercher", "Recherche", 3);
/*  62 */     String ret = modele.select_entete(result);
/*     */ 
/*  66 */     this.modele_list = new list_MP_modele(modele, result);
/*  67 */     this.modele_list_uo = new list_UO_modele(modele, result);
/*  68 */     JTabbedPane pane = new JTabbedPane();
/*  69 */     getContentPane().add(pane, "Center");
/*  70 */     setTitle("Stellinox - fiche");
/*  71 */     setResizable(false);
/*  72 */     setSize(600, 400);
/*  73 */     setIconImage(new ImageIcon(getClass().getResource("essai.png")).getImage());
/*     */ 
/*  75 */     JPanel information = new JPanel(new BorderLayout());
/*  76 */     JPanel ssinformation = new JPanel(new GridLayout(2, 1));
/*     */ 
/*  83 */     pane.add("information", information);
/*     */ 
/*  92 */     JPanel SurCode = new JPanel(new BorderLayout());
/*  93 */     JPanel Code = new JPanel(new FlowLayout());
/*  94 */     JPanel sscode = new JPanel(new FlowLayout());
/*  95 */     this.code = new JTextField();
/*  96 */     sscode.add(this.code);
/*  97 */     this.messcode = new JLabel("Code :      ");
/*  98 */     Font police = new Font("Arial", 1, 14);
/*  99 */     this.code.setFont(police);
/* 100 */     this.code.setPreferredSize(new Dimension(150, 30));
/* 101 */     Code.add(this.messcode);
/* 102 */     Code.add(sscode);
/* 103 */     SurCode.add(Code, "West");
/* 104 */     ssinformation.add(SurCode);
/* 105 */     this.code.setText(result);
/*     */ 
/* 111 */     JPanel Surdes = new JPanel(new BorderLayout());
/* 112 */     JPanel Des = new JPanel(new FlowLayout());
/* 113 */     JPanel ssDes = new JPanel(new FlowLayout());
/* 114 */     this.des = new JTextArea(1, 1);
/* 115 */     ssDes.add(this.des);
/* 116 */     this.messdes = new JLabel("Désignation :      ");
/*     */ 
/* 118 */     this.des.setFont(police);
/*     */ 
/* 120 */     Des.add(this.messdes);
/* 121 */     Des.add(ssDes);
/* 122 */     Surdes.add(Des, "West");
/* 123 */     ssinformation.add(Surdes);
/* 124 */     this.des.setText(ret);
/* 125 */     this.des.setCaretPosition(0);
/*     */ 
/* 127 */     information.add(ssinformation, "Center");
/*     */ 
/* 130 */     this.button_g = new JPanel(new GridLayout(1, 3));
/* 131 */     this.ssbut_g = new JPanel(new FlowLayout());
/* 132 */     this.sauver = new JButton("Sauvegarder");
/* 133 */     this.retour_g = new JButton("retour");
/* 134 */     this.ssbut_g.add(this.sauver);
/* 135 */     this.button_g.add(this.ssbut_g);
/* 136 */     this.ssbut_g.add(this.retour_g);
/* 137 */     this.button_g.add(this.ssbut_g);
/* 138 */     information.add(this.button_g, "South");
/*     */ 
/* 143 */     JPanel mp = new JPanel();
/* 144 */     JPanel button = new JPanel(new GridLayout(1, 3));
/* 145 */     JPanel ssbut = new JPanel(new FlowLayout());
/* 146 */     this.retour = new JButton("retour");
/* 147 */     mp.setLayout(new BorderLayout());
/* 148 */     pane.add("matiere premiere", mp);
/* 149 */     this.tableau = new JTable(this.modele_list);
/* 150 */     mp.add(new JScrollPane(this.tableau), "Center");
/* 151 */     this.ajouter = new JButton("Ajouter");
/* 152 */     this.supprimer = new JButton("Supprimer");
/* 153 */     ssbut.add(this.ajouter);
/* 154 */     button.add(ssbut);
/* 155 */     ssbut.add(this.supprimer);
/* 156 */     button.add(ssbut);
/* 157 */     ssbut.add(this.retour);
/* 158 */     button.add(ssbut);
/* 159 */     mp.add(button, "South");
/*     */ 
/* 164 */     JPanel uo = new JPanel();
/* 165 */     this.button1 = new JPanel(new GridLayout(1, 3));
/* 166 */     this.ssbut1 = new JPanel(new FlowLayout());
/* 167 */     uo.setLayout(new BorderLayout());
/* 168 */     pane.add("unité d'oeuvre", uo);
/* 169 */     this.tableau_uo = new JTable(this.modele_list_uo);
/* 170 */     uo.add(new JScrollPane(this.tableau_uo), "Center");
/* 171 */     this.ajouter_uo = new JButton("Ajouter");
/* 172 */     this.supprimer_uo = new JButton("Supprimer");
/* 173 */     this.retour_uo = new JButton("retour");
/* 174 */     this.ssbut1.add(this.ajouter_uo);
/* 175 */     this.button1.add(this.ssbut1);
/* 176 */     this.ssbut1.add(this.supprimer_uo);
/* 177 */     this.button1.add(this.ssbut1);
/* 178 */     this.ssbut1.add(this.retour_uo);
/* 179 */     this.button1.add(this.ssbut1);
/* 180 */     uo.add(this.button1, "South");
/*     */ 
/* 185 */     setVisible(true);
/*     */ 
/* 187 */     pack();
/* 188 */     setLocationRelativeTo(null);
/* 189 */     setVisible(true);
/*     */ 
/* 191 */     this.ajouter.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/* 197 */         String code = JOptionPane.showInputDialog(this.parent, "entrez le code à ajouter", "Ajouter", 3);
/* 198 */         String quant = JOptionPane.showInputDialog(this.parent, "entrez la quantité", "Ajouter", 3);
/* 199 */         Float quantite = Float.valueOf(Float.parseFloat(quant));
/* 200 */         MP mpp = new MP(code, quantite);
/* 201 */         int ret = modifier_fiche_vue.this.modele_list.addmp(mpp);
/* 202 */         if (ret == 1)
/* 203 */           JOptionPane.showMessageDialog(this.parent, "Ajout executé avec succés", "ajout", 1);
/* 204 */         else if (ret == 0)
/* 205 */           JOptionPane.showMessageDialog(this.parent, "erreur lors de l'ajout", "ajout", 0);
/*     */       }
/*     */     });
/* 210 */     this.supprimer.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/* 216 */         int ret = modifier_fiche_vue.this.tableau.getSelectedRow();
/* 217 */         int retour = JOptionPane.showConfirmDialog(this.parent, "supprimer", "Voulez-vous reellement supprimer?", 2);
/* 218 */         if (retour == 0) {
/* 219 */           int re = modifier_fiche_vue.this.modele_list.removemp(ret);
/* 220 */           if (re == 1)
/* 221 */             JOptionPane.showMessageDialog(this.parent, "Suppression executé avec succés", "supprimer", 1);
/* 222 */           else if (re == 0)
/* 223 */             JOptionPane.showMessageDialog(this.parent, "erreur lors de la suppression", "supprimer", 0);
/*     */         }
/*     */       }
/*     */     });
/* 229 */     this.ajouter_uo.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/* 235 */         String num = JOptionPane.showInputDialog(this.parent, "entrez le numéro du centre a ajouter", "Ajouter", 3);
/* 236 */         String tps = JOptionPane.showInputDialog(this.parent, "entrez la la série de temps", "Ajouter", 3);
/* 237 */         String qu = JOptionPane.showInputDialog(this.parent, "entrez la la série de quantité", "Ajouter", 3);
/* 238 */         Integer serietps = Integer.valueOf(Integer.parseInt(tps));
/* 239 */         Integer seriequ = Integer.valueOf(Integer.parseInt(qu));
/* 240 */         UO Uo = new UO(num, serietps.intValue(), seriequ.intValue(), null);
/* 241 */         int ret = modifier_fiche_vue.this.modele_list_uo.adduo(Uo);
/* 242 */         if (ret == 1)
/* 243 */           JOptionPane.showMessageDialog(this.parent, "Ajout executé avec succés", "ajout", 1);
/* 244 */         else if (ret == 0)
/* 245 */           JOptionPane.showMessageDialog(this.parent, "erreur lors de l'ajout", "ajout", 0);
/*     */       }
/*     */     });
/* 250 */     this.supprimer_uo.addActionListener(new ActionListener()
/*     */     {
/*     */       private Component parent;
/*     */ 
/*     */       public void actionPerformed(ActionEvent e)
/*     */       {
/* 256 */         int ret = modifier_fiche_vue.this.tableau_uo.getSelectedRow();
/* 257 */         int retour = JOptionPane.showConfirmDialog(this.parent, "supprimer", "Voulez-vous reellement supprimer?", 2);
/* 258 */         if (retour == 0) {
/* 259 */           int re = modifier_fiche_vue.this.modele_list_uo.removeuo(ret);
/* 260 */           if (re == 1)
/* 261 */             JOptionPane.showMessageDialog(this.parent, "Suppression executé avec succés", "supprimer", 1);
/* 262 */           else if (re == 0)
/* 263 */             JOptionPane.showMessageDialog(this.parent, "erreur lors de la suppression", "supprimer", 0);
/*     */         }
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   public String getCode()
/*     */   {
/* 271 */     return this.code.getText();
/*     */   }
/*     */ 
/*     */   public String getDes() {
/* 275 */     return this.des.getText();
/*     */   }
/*     */ 
/*     */   public void update(Observable arg0, Object arg1)
/*     */   {
/* 280 */     System.out.println("ok");
/* 281 */     this.code.setText(this.modele.getCode());
/* 282 */     this.des.setText(this.modele.getDes());
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Vue.modifier_fiche_vue
 * JD-Core Version:    0.6.2
 */
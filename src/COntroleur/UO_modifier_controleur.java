/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.UO_modifier_modele;
/*    */ import Vue.UO_modifier_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.io.PrintStream;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class UO_modifier_controleur
/*    */   implements ActionListener
/*    */ {
/* 14 */   UO_modifier_modele modele = null;
/* 15 */   UO_modifier_vue vue = null;
/* 16 */   BDD bdd = null;
/*    */ 
/* 18 */   public UO_modifier_controleur(UO_modifier_modele modele, UO_modifier_vue vue, BDD bdd) { this.modele = modele;
/* 19 */     this.vue = vue;
/* 20 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent event)
/*    */   {
/* 25 */     if (event.getSource() == this.vue.rechercher) {
/* 26 */       String result = JOptionPane.showInputDialog(this.vue, "entrez le code à rechercher", "Recherche", 3);
/* 27 */       this.modele.select_uo(result);
/* 28 */       System.out.println(result);
/*    */     }
/* 30 */     if (event.getSource() == this.vue.retour) {
/* 31 */       this.vue.dispose();
/*    */     }
/* 33 */     if (event.getSource() == this.vue.sauver) {
/* 34 */       int ret = this.modele.maj_uo(this.vue.getCode(), this.vue.getDes(), this.vue.getCout(), this.vue.getUnit(), this.vue.getPu());
/* 35 */       if (ret == 1)
/* 36 */         JOptionPane.showMessageDialog(this.vue, "base de donnée mise à jour avec succés", "Mise à jour", 1);
/*    */       else
/* 38 */         JOptionPane.showMessageDialog(this.vue, "Erreur mise à jour base de donnée", "Mise à jour", 0);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.UO_modifier_controleur
 * JD-Core Version:    0.6.2
 */
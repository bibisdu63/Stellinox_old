/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.UO_supprimer_modele;
/*    */ import Vue.UO_supprimer_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.io.PrintStream;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class UO_supprimer_controleur
/*    */   implements ActionListener
/*    */ {
/* 14 */   UO_supprimer_modele modele = null;
/* 15 */   UO_supprimer_vue vue = null;
/* 16 */   BDD bdd = null;
/*    */ 
/* 18 */   public UO_supprimer_controleur(UO_supprimer_modele modele, UO_supprimer_vue vue, BDD bdd) { this.modele = modele;
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
/* 30 */     else if (event.getSource() == this.vue.retour) {
/* 31 */       this.vue.dispose();
/* 32 */       this.modele = null;
/* 33 */       this.vue = null;
/* 34 */       this.bdd = null;
/*    */     }
/* 36 */     else if (event.getSource() == this.vue.suppr) {
/* 37 */       System.out.println("supprimer");
/* 38 */       int retour = JOptionPane.showConfirmDialog(this.vue, "Voulez-vous confirmer la suppression ?", "Confirmation de suppression", 0, 3);
/*    */ 
/* 40 */       if (retour == 0)
/*    */       {
/* 42 */         int ret = this.modele.suppr_uo(this.vue.getCode());
/* 43 */         if (ret == 1) {
/* 44 */           JOptionPane.showMessageDialog(this.vue, "Suppression executé avec succés", "Suppression", 1);
/* 45 */           this.vue.dispose();
/*    */         } else {
/* 47 */           JOptionPane.showMessageDialog(this.vue, "Erreur lors de la suppression - cette matière première est encore utilisé par certains aticle", "Suppression", 0);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.UO_supprimer_controleur
 * JD-Core Version:    0.6.2
 */
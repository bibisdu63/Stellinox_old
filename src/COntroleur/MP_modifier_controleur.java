/*    */ package COntroleur;
/*    */ 
/*    */ import Modele.MP_modifier_modele;
/*    */ import Vue.MP_modifier_vue;
/*    */ import bd.BDD;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JTextField;
/*    */ 
/*    */ public class MP_modifier_controleur
/*    */   implements ActionListener
/*    */ {
/* 14 */   MP_modifier_modele modele = null;
/* 15 */   MP_modifier_vue vue = null;
/* 16 */   BDD bdd = null;
/*    */ 
/* 18 */   public MP_modifier_controleur(MP_modifier_modele modele, MP_modifier_vue vue, BDD bdd) { this.modele = modele;
/* 19 */     this.vue = vue;
/* 20 */     this.bdd = bdd;
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent event)
/*    */   {
/* 25 */     if (event.getSource() == this.vue.rechercher) {
/* 26 */       String result = JOptionPane.showInputDialog(this.vue, "entrez le code à rechercher", "Recherche", 3);
/* 27 */       this.modele.select_mp(result);
/*    */     }
/* 29 */     if (event.getSource() == this.vue.retour) {
/* 30 */       this.vue.dispose();
/*    */     }
/* 32 */     if (event.getSource() == this.vue.sauver) {
/* 33 */       int ret = this.modele.maj_mp(this.vue.getCode().getText(), this.vue.getUnit().getText(), this.vue.getPu().getText());
/* 34 */       if (ret == 1)
/* 35 */         JOptionPane.showMessageDialog(this.vue, "base de donnée mise à jour avec succés", "Mise à jour", 1);
/*    */       else
/* 37 */         JOptionPane.showMessageDialog(this.vue, "Erreur mise à jour base de donnée", "Mise à jour", 0);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     COntroleur.MP_modifier_controleur
 * JD-Core Version:    0.6.2
 */
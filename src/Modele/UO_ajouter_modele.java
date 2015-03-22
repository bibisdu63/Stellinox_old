/*    */ package Modele;
/*    */ 
/*    */ import bd.BDD;
/*    */ import java.util.Observable;
/*    */ 
/*    */ public class UO_ajouter_modele extends Observable
/*    */ {
/*  9 */   BDD bd = null;
/*    */ 
/*    */   public UO_ajouter_modele(BDD bdd) {
/* 12 */     this.bd = bdd;
/*    */   }
/*    */ 
/*    */   public int ajouter_uo(String num, String des, String cout, String unite, String type)
/*    */   {
/* 17 */     int res = this.bd.ajout_uo(num, des, cout, unite, type);
/* 18 */     if (res == 1) {
/* 19 */       return 1;
/*    */     }
/*    */ 
/* 22 */     return 0;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.UO_ajouter_modele
 * JD-Core Version:    0.6.2
 */
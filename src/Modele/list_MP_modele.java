/*    */ package Modele;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.swing.table.AbstractTableModel;
/*    */ 
/*    */ public class list_MP_modele extends AbstractTableModel
/*    */ {
/*    */   private static final long serialVersionUID = 865633482522471212L;
/* 14 */   private final List<MP> mp = new ArrayList();
/* 15 */   modifier_fiche_modele modele = null;
/* 16 */   String reference = null;
/* 17 */   private final String[] entetes = { "reference", "quantite" };
/*    */ 
/*    */   public list_MP_modele(modifier_fiche_modele modele, String reference)
/*    */   {
/* 21 */     this.modele = modele;
/* 22 */     this.reference = reference;
/* 23 */     ResultSet rs = modele.selectmp(reference);
/*    */     try {
/* 25 */       while (rs.next())
/* 26 */         this.mp.add(new MP(rs.getString(1), Float.valueOf(rs.getFloat(2))));
/*    */     }
/*    */     catch (SQLException e) {
/* 29 */       System.out.println("erreur");
/*    */     }
/*    */   }
/*    */ 
/*    */   public int getRowCount() {
/* 34 */     return this.mp.size();
/*    */   }
/*    */ 
/*    */   public int getColumnCount() {
/* 38 */     return this.entetes.length;
/*    */   }
/*    */ 
/*    */   public String getColumnName(int columnIndex) {
/* 42 */     return this.entetes[columnIndex];
/*    */   }
/*    */ 
/*    */   public Object getValueAt(int rowIndex, int columnIndex) {
/* 46 */     switch (columnIndex) {
/*    */     case 0:
/* 48 */       return ((MP)this.mp.get(rowIndex)).getCode();
/*    */     case 1:
/* 50 */       return ((MP)this.mp.get(rowIndex)).getquantite();
/*    */     }
/* 52 */     return null;
/*    */   }
/*    */ 
/*    */   public int addmp(MP mpp)
/*    */   {
/* 57 */     this.mp.add(mpp);
/* 58 */     int ret = this.modele.add_mp(this.reference, mpp.getCode(), mpp.getquantite());
/* 59 */     fireTableRowsInserted(this.mp.size() - 1, this.mp.size() - 1);
/* 60 */     return ret;
/*    */   }
/*    */ 
/*    */   public int removemp(int rowIndex) {
/* 64 */     this.mp.remove(rowIndex);
/* 65 */     int ret = this.modele.remove_mp(this.reference, ((MP)this.mp.get(rowIndex - 1)).getCode(), ((MP)this.mp.get(rowIndex - 1)).getquantite());
/* 66 */     fireTableRowsDeleted(rowIndex, rowIndex);
/* 67 */     return ret;
/*    */   }
/*    */ 
/*    */   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
/*    */   {
/* 72 */     if (aValue != null) {
/* 73 */       MP mpp = (MP)this.mp.get(rowIndex);
/*    */ 
/* 75 */       switch (columnIndex) {
/*    */       case 0:
/* 77 */         mpp.setCode((String)aValue);
/* 78 */         break;
/*    */       case 1:
/* 80 */         System.out.println("ok");
/* 81 */         Float fl = Float.valueOf(Float.parseFloat((String)aValue));
/* 82 */         mpp.setquantite(fl);
/* 83 */         this.modele.update_quantite(this.reference, ((MP)this.mp.get(rowIndex)).getCode(), ((MP)this.mp.get(rowIndex)).getquantite());
/*    */       }
/*    */     }
/*    */   }
/*    */ 
/*    */   public boolean isCellEditable(int rowIndex, int columnIndex)
/*    */   {
/* 91 */     if (columnIndex == 0) return false;
/* 92 */     return true;
/*    */   }
/*    */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.list_MP_modele
 * JD-Core Version:    0.6.2
 */
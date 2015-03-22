/*     */ package Modele;
/*     */ 
/*     */ import java.io.PrintStream;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.table.AbstractTableModel;
/*     */ 
/*     */ public class list_UO_modele extends AbstractTableModel
/*     */ {
/*     */   private static final long serialVersionUID = 865633482522471212L;
/*  14 */   private final List<UO> uo = new ArrayList();
/*  15 */   modifier_fiche_modele modele = null;
/*  16 */   String reference = null;
/*  17 */   private final String[] entetes = { "Numéro Centre", "serie Temps", " Série Quantité", "ordre" };
/*     */ 
/*     */   public list_UO_modele(modifier_fiche_modele modele, String reference)
/*     */   {
/*  21 */     this.modele = modele;
/*  22 */     this.reference = reference;
/*  23 */     ResultSet rs = modele.selectuo(reference);
/*     */     try {
/*  25 */       while (rs.next())
/*  26 */         this.uo.add(new UO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4)));
/*     */     }
/*     */     catch (SQLException e) {
/*  29 */       System.out.println("erreur");
/*     */     }
/*     */   }
/*     */ 
/*     */   public int getRowCount() {
/*  34 */     return this.uo.size();
/*     */   }
/*     */ 
/*     */   public int getColumnCount() {
/*  38 */     return this.entetes.length;
/*     */   }
/*     */ 
/*     */   public String getColumnName(int columnIndex) {
/*  42 */     return this.entetes[columnIndex];
/*     */   }
/*     */ 
/*     */   public Object getValueAt(int rowIndex, int columnIndex) {
/*  46 */     switch (columnIndex) {
/*     */     case 0:
/*  48 */       return ((UO)this.uo.get(rowIndex)).getNumcentre();
/*     */     case 1:
/*  50 */       return Integer.valueOf(((UO)this.uo.get(rowIndex)).getSerietps());
/*     */     case 2:
/*  52 */       return Integer.valueOf(((UO)this.uo.get(rowIndex)).getSerieQu());
/*     */     case 3:
/*  54 */       return ((UO)this.uo.get(rowIndex)).getOrdre();
/*     */     }
/*  56 */     return null;
/*     */   }
/*     */ 
/*     */   public int adduo(UO Uo)
/*     */   {
/*  61 */     this.uo.add(Uo);
/*  62 */     int ret = this.modele.add_uo(this.reference, Uo.getNumcentre(), Integer.valueOf(Uo.getSerietps()), Integer.valueOf(Uo.getSerieQu()));
/*  63 */     fireTableRowsInserted(this.uo.size() - 1, this.uo.size() - 1);
/*  64 */     return ret;
/*     */   }
/*     */ 
/*     */   public int removeuo(int rowIndex) {
/*  68 */     this.uo.remove(rowIndex);
/*  69 */     int ret = this.modele.remove_uo(this.reference, ((UO)this.uo.get(rowIndex - 1)).getNumcentre(), Integer.valueOf(((UO)this.uo.get(rowIndex - 1)).getSerietps()), Integer.valueOf(((UO)this.uo.get(rowIndex - 1)).getSerieQu()), ((UO)this.uo.get(rowIndex - 1)).getOrdre());
/*  70 */     fireTableRowsDeleted(rowIndex, rowIndex);
/*  71 */     return ret;
/*     */   }
/*     */ 
/*     */   public void setValueAt(Object aValue, int rowIndex, int columnIndex)
/*     */   {
/*  76 */     if (aValue != null) {
/*  77 */       UO Uo = (UO)this.uo.get(rowIndex);
/*     */ 
/*  79 */       switch (columnIndex) {
/*     */       case 0:
/*  81 */         Uo.setNumcentre((String)aValue);
/*  82 */         break;
/*     */       case 1:
/*  84 */         Integer fl = Integer.valueOf(Integer.parseInt((String)aValue));
/*  85 */         Uo.setSerietps(fl.intValue());
/*  86 */         this.modele.update_gamme_tps(this.reference, ((UO)this.uo.get(rowIndex)).getNumcentre(), Integer.valueOf(((UO)this.uo.get(rowIndex)).getSerietps()), Integer.valueOf(((UO)this.uo.get(rowIndex)).getSerieQu()));
/*  87 */         break;
/*     */       case 2:
/*  89 */         Integer f2 = Integer.valueOf(Integer.parseInt((String)aValue));
/*  90 */         Uo.setSerieQu(f2.intValue());
/*  91 */         this.modele.update_gamme_qu(this.reference, ((UO)this.uo.get(rowIndex)).getNumcentre(), Integer.valueOf(((UO)this.uo.get(rowIndex)).getSerietps()), Integer.valueOf(((UO)this.uo.get(rowIndex)).getSerieQu()));
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean isCellEditable(int rowIndex, int columnIndex)
/*     */   {
/*  99 */     if (columnIndex == 0) return false;
/* 100 */     if (columnIndex == 3) return false;
/* 101 */     return true;
/*     */   }
/*     */ }

/* Location:           C:\Users\Bastien\Desktop\prix_revient.jar
 * Qualified Name:     Modele.list_UO_modele
 * JD-Core Version:    0.6.2
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sevrice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.PCDesktop;

/**
 *
 * @author Admin
 */
public class QlPCDesktop {
    
    private List<PCDesktop> dsPCDesktop = new ArrayList();
    
    public QlPCDesktop(){
//        dsPCDesktop.add(new PCDesktop(1L, "SP 1", 10, BigDecimal.valueOf(1000000), "Ryzen 3", 4));
//        dsPCDesktop.add(new PCDesktop(2L, "SP 2", 20, BigDecimal.valueOf(2000000), "Ryzen 5", 6));
//        dsPCDesktop.add(new PCDesktop(3L, "SP 3", 30, BigDecimal.valueOf(3000000), "Ryzen 7", 8));
//        dsPCDesktop.add(new PCDesktop(4L, "SP 4", 40, BigDecimal.valueOf(4000000), "Intel 3", 12));
//        dsPCDesktop.add(new PCDesktop(5L, "SP 5", 50, BigDecimal.valueOf(5000000), "Intel 5", 16));
//        dsPCDesktop.add(new PCDesktop(6L, "SP 6", 60, BigDecimal.valueOf(6000000), "Intel 5", 8));
    }
    
    public List<PCDesktop> layDsPCDesktop(){
        return dsPCDesktop;
    }
    
    public void themPCDesktop(PCDesktop pcMoi){
        dsPCDesktop.add(pcMoi);
    }
    
    public void capNhatPCDesktopTheoMa(PCDesktop pcCapNhat){
        Long desktopId = pcCapNhat.getDesktopId();
        for (int i = 0; i < dsPCDesktop.size(); i++) {
            PCDesktop pcHienTai = dsPCDesktop.get(i);
            if (pcHienTai.getDesktopId().equals(desktopId)) {
                dsPCDesktop.set(i, pcCapNhat);
                return;
            }
        }
    }
    
    public void xoaPCDesktop(Long desktopId){
        for (int i = 0; i < dsPCDesktop.size(); i++) {
            PCDesktop pcHienTai = dsPCDesktop.get(i);
            if (pcHienTai.getDesktopId().equals(desktopId)) {
                dsPCDesktop.remove(i);
                return;
            }
        }
    }
}

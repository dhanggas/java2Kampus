
import java.io.File;
import java.sql.Connection;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class PanggilLaporan {

    public PanggilLaporan(String namaReport) {
        try {
            Koneksi koneksi = new Koneksi();
            Connection con = koneksi.getConnection();
            File fileReport = new File(namaReport);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(fileReport.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, null,con);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        new PanggilLaporan("./src/laporan/lapBarang.jasper");
    }
    
    
}

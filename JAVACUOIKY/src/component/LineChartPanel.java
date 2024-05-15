package component;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import raven.chart.data.category.DefaultCategoryDataset;
import raven.chart.line.LineChart;

public class LineChartPanel extends JPanel {

    private LineChart lineChart;
    private process_data.lineChart lc;

    public LineChartPanel() {
        initComponents();
        lineChart = new LineChart();
        lineChart.setChartType(LineChart.ChartType.LINE);
        lineChart.putClientProperty("FlatClientProperties.STYLE", "border:5,5,5,5,$Component.borderColor,,20");
        add(lineChart, "grow"); // Thêm lineChart vào JPanel với MigLayout
        createLineChartData();
    }

    private void createLineChartData() {
    DefaultCategoryDataset<String, String> categoryDataset = new DefaultCategoryDataset<>();
    lc = new process_data.lineChart();
    lineChart.setCategoryDataset(lc.DataLineChart1());
}
    private void initComponents() {
        setLayout(new MigLayout("fill"));
        setBackground(Color.WHITE); // Thiết lập màu nền cho JPanel
    }
   
}

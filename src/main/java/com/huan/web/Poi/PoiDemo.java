package com.huan.web.Poi;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by 马欢欢 on 17-9-26.
 */
public class PoiDemo {

    @Test
    public  void test() throws IOException {
        //定义一个工作蒲
        Workbook wb = new HSSFWorkbook();
        //定义一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/ubuntu/Desktop/Excel工作蒲.xls");
        //写入在输出流
        wb.write(fileOutputStream);
        //关闭输出流
        fileOutputStream.close();
    }

    @Test
    public void sheet() throws IOException {
        //定义一个工作蒲
        Workbook wb = new HSSFWorkbook();
        //创建sheet页面
        wb.createSheet("第一个sheet页");
        wb.createSheet("第二个sheet页");

        //定义一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/ubuntu/Desktop/Excel工作蒲带有sheet页.xls");
        //写入在输出流
        wb.write(fileOutputStream);
        //关闭输出流
        fileOutputStream.close();
    }
    @Test
    public void row() throws IOException {
        //定义一个工作蒲
        Workbook wb = new HSSFWorkbook();
        //创建sheet页面
        Sheet sheet = wb.createSheet("学生信息sheet页");
        //创建一行
        Row row = sheet.createRow(0);
        //创建一个单元格
        Cell cell =null;
        for(int i = 0 ;i<5;i++){
            row.createCell(i).setCellValue("写入信息：单元格内容"+i);
        }
        //定义一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/ubuntu/Desktop/Excel学生信息.xls");
        //写入在输出流
        wb.write(fileOutputStream);
        //关闭输出流
        fileOutputStream.close();
    }
    @Test
    public void date() throws IOException {
        //定义一个工作蒲
        Workbook wb = new HSSFWorkbook();
        //创建sheet页面
        Sheet sheet = wb.createSheet("时间sheet页");
        //创建一行
        Row row = sheet.createRow(0);
        //创建一个单元格
        Cell cell = row.createCell(0);
        cell.setCellValue(new Date());

        CreationHelper creationHelper = wb.getCreationHelper();
        //设置单元格样式
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setDataFormat(creationHelper.createDataFormat().getFormat("YYYY-MM-DD hh:mm:ss"));
        cell = row.createCell(1);
        cell.setCellValue(new Date());
        //设置日期样式
        cell.setCellStyle(cellStyle);

        cell = row.createCell(2);
        cell.setCellValue(Calendar.getInstance());
        cell.setCellStyle(cellStyle);

        //定义一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/ubuntu/Desktop/Excel日期格式.xls");
        //写入在输出流
        wb.write(fileOutputStream);
        //关闭输出流
        fileOutputStream.close();
    }

    @Test
    public void style() throws IOException {
        //定义一个工作蒲
        Workbook wb = new HSSFWorkbook();
        //创建sheet页面
        Sheet sheet = wb.createSheet("第一个asdfeet");
        sheet.autoSizeColumn(1, true);
        //创建一行
        Row row = sheet.createRow(0);
        //设置行高
        row.setHeightInPoints(30);
        //创建一个单元格
        createCell(wb,row,(short)0,HSSFCellStyle.ALIGN_CENTER,HSSFCellStyle.VERTICAL_BOTTOM);
        createCell(wb,row,(short)1,HSSFCellStyle.ALIGN_JUSTIFY,HSSFCellStyle.VERTICAL_CENTER);
        createCell(wb,row,(short)2,HSSFCellStyle.ALIGN_CENTER_SELECTION,HSSFCellStyle.VERTICAL_JUSTIFY);

        //定义一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/ubuntu/Desktop/Excel样式.xls");
        //写入在输出流
        wb.write(fileOutputStream);
        //关闭输出流
        fileOutputStream.close();
    }

    /**
     * 创建一个单元格设置对应的对其方式
     * @param workbook 工作蒲
     * @param row 行
     * @param column 列
     */
    private static void createCell(Workbook workbook, Row row, short column,short halign,short valign){
        Cell cell = row.createCell(column);//创建单元格
        cell.setCellValue(new HSSFRichTextString("我是富文本"));//设置值
        CellStyle cellStyle = workbook.createCellStyle();//创建样式
        cellStyle.setAlignment(halign);//设置单元格水平方向对其方式
        cellStyle.setVerticalAlignment(valign);//设置单元格垂直方向对其方式
        cell.setCellStyle(cellStyle);
    }

    @Test
    public void test1() throws IOException {
        //定义一个工作蒲
        Workbook wb = new HSSFWorkbook();
        //创建sheet页面
        Sheet sheet = wb.createSheet("第一个sheet");
        //创建一行
        Row row = sheet.createRow(1);
        //设置行高
        row.setHeightInPoints(30);
        //创建一个单元格
        Cell cell = row.createCell(1);
        cell.setCellValue("合并单元格");
        //合并单元格（起始行,结束行,起始列,结束列）
        sheet.addMergedRegion(new CellRangeAddress(1,2,1,2));

        //定义一个输出流
        FileOutputStream fileOutputStream = new FileOutputStream("/home/ubuntu/Desktop/Excel样式.xls");
        //写入在输出流
        wb.write(fileOutputStream);
        //关闭输出流
        fileOutputStream.close();
    }

}

package com.jsh.util;

/**
 * 定义商品信息常量
 *
 * @author jishenghua
 */
public interface MaterialConstants {
    /**
     * 公共常量
     *
     * @author ji  sheng hua
     */
    public class Common {

    }

    /**
     * 常量--导入导出excel表格业务相关
     *
     * @author jishenghua
     */
    public class BusinessForExcel {
        /**
         * 名称
         */
        public static final int EXCEL_NAME = 0;

        /**
         * 类型
         */
        public static final int EXCEL_CATEGORY = 1;

        /**
         * 型号
         */
        public static final int EXCEL_MODEL = 2;

        /**
         * 安全存量
         */
        public static final int EXCEL_SAFETY_STOCK = 3;

        /**
         * 单位
         */
        public static final int EXCEL_UNIT = 4;

        /**
         * 零售价
         */
        public static final int EXCEL_RETAILPRICE = 5;

        /**
         * 最低售价
         */
        public static final int EXCEL_LOWPRICE = 6;

        /**
         * 预计采购价
         */
        public static final int EXCEL_PRESETPRICEONE = 7;

        /**
         * 批发价
         */
        public static final int EXCEL_PRESETPRICETWO = 8;

        /**
         * 备注
         */
        public static final int EXCEL_REMARK = 9;

        /**
         * 表头
         */
        public static final int EXCEL_TABLE_HEAD = 0;

        /**
         * action返回excel结果
         */
        public static final String EXCEL = "excel";
    }
}

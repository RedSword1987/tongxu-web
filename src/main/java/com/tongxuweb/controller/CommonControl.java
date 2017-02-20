package com.tongxuweb.controller;

import com.tongxuweb.domain.entity.SearchTaskResultBean;
import com.tongxuweb.service.TaskGetdataTaobaoService;
import com.tongxuweb.util.DateUtil;
import com.tongxuweb.util.ExcelUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * Created by higgs on 17/2/19.
 */
@Controller
@RequestMapping("/common")
public class CommonControl {
    @Resource
    private TaskGetdataTaobaoService taskGetdataTaobaoService;

    /**
     * @param request
     * @return result:true 或者 false msg：描述
     * @throws IOException
     */
    @RequestMapping("/common_download_xls")
    public void common_download_xls(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SearchTaskResultBean searchTaskResultBean = new SearchTaskResultBean(request);

        searchTaskResultBean.setLimit(100000);
        searchTaskResultBean.setOffset(0);

        List<Map<String, Object>> listResult = taskGetdataTaobaoService.listTaskResultMap(searchTaskResultBean);

        String fileName = "ID_" + searchTaskResultBean.getId() + "_" + DateUtil.getTimeStringNow("yyyy-MM-dd");
        String columnNames[] = {"订单编号", "订单创建时间", "订单买家状态", "订单卖家状态", "快递公司", "快递号", "淘宝物流编号",
                "购买者昵称", "注册手机", "收货手机", "省",
                "市", "区", "邮编", "详细地址", "支付时间", "发货时间", "支付单号", "物流最后状态", "物流明细"};// 列名
        String keys[] = {"orderinfo_id", "orderinfo_createtime", "order_bar_text", "statusinfo_text",
                "logistics_name", "logistics_num", "logistics_num_taobao", "buyer_nick", "buyer_phonenum", "buyer_logistics_phone",
                "buyer_provice", "buyer_city", "buyer_area", "buyer_post", "buyer_address", "pay_time", "send_time", "alipay_id"
                , "logistics_last_desc", "logistics_desc"};// map中的key
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ExcelUtil.createWorkBook(listResult, keys, columnNames).write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        // 设置response参数，可以打开下载页面
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "iso-8859-1"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(is);
            bos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            // Simple read/write loop.
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (bis != null)
                bis.close();
            if (bos != null)
                bos.close();
        }
    }

}

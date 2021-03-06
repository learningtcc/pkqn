package com.michael.spec.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.michael.poi.exp.ExportEngine;
import com.michael.spec.bo.PoorTeenagersBo;
import com.michael.spec.domain.PoorTeenagers;
import com.michael.spec.service.CondoleService;
import com.michael.spec.service.PoorTeenagersService;
import com.michael.spec.vo.CondoleVo;
import com.michael.spec.vo.PoorTeenagersVo;
import com.ycrl.base.common.JspAccessType;
import com.ycrl.core.pager.PageVo;
import com.ycrl.core.web.BaseController;
import com.ycrl.utils.gson.DateStringConverter;
import com.ycrl.utils.gson.GsonUtils;
import eccrm.base.attachment.AttachmentProvider;
import eccrm.core.security.LoginInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Michael
 */
@Controller
@RequestMapping(value = {"/spec/poorTeenagers"})
public class PoorTeenagersCtrl extends BaseController {
    @Resource
    private PoorTeenagersService poorTeenagersService;

    @Resource
    private CondoleService condoleService;

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String toList() {
        return "spec/poorTeenagers/list/poorTeenagers_list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String toAdd(HttpServletRequest request) {
        request.setAttribute(JspAccessType.PAGE_TYPE, JspAccessType.ADD);
        return "spec/poorTeenagers/edit/poorTeenagers_edit";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public void save(HttpServletRequest request, HttpServletResponse response) {
        PoorTeenagers poorTeenagers = GsonUtils.wrapDataToEntity(request, PoorTeenagers.class);
        poorTeenagersService.save(poorTeenagers);
        GsonUtils.printSuccess(response);
    }

    @RequestMapping(value = "/modify", params = {"id"}, method = RequestMethod.GET)
    public String toModify(@RequestParam String id, HttpServletRequest request) {
        request.setAttribute(JspAccessType.PAGE_TYPE, JspAccessType.MODIFY);
        request.setAttribute("id", id);
        return "spec/poorTeenagers/edit/poorTeenagers_edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(HttpServletRequest request, HttpServletResponse response) {
        PoorTeenagers poorTeenagers = GsonUtils.wrapDataToEntity(request, PoorTeenagers.class);
        poorTeenagersService.update(poorTeenagers);
        GsonUtils.printSuccess(response);
    }

    @RequestMapping(value = {"/detail"}, params = {"id"}, method = RequestMethod.GET)
    public String toDetail(@RequestParam String id, HttpServletRequest request) {
        request.setAttribute(JspAccessType.PAGE_TYPE, JspAccessType.DETAIL);
        request.setAttribute("id", id);
        return "spec/poorTeenagers/edit/poorTeenagers_edit";
    }

    @ResponseBody
    @RequestMapping(value = "/get", params = {"id"}, method = RequestMethod.GET)
    public void findById(@RequestParam String id, HttpServletResponse response) {
        PoorTeenagersVo vo = poorTeenagersService.findById(id);
        GsonUtils.printData(response, vo);
    }

    @ResponseBody
    @RequestMapping(value = "/pageQuery", method = RequestMethod.POST)
    public void pageQuery(HttpServletRequest request, HttpServletResponse response) {
        PoorTeenagersBo bo = GsonUtils.wrapDataToEntity(request, PoorTeenagersBo.class);
        PageVo pageVo = poorTeenagersService.pageQuery(bo);
        GsonUtils.printData(response, pageVo);
    }

    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public void export(HttpServletRequest request, HttpServletResponse response) {
        PoorTeenagersBo bo = GsonUtils.wrapDataToEntity(request, PoorTeenagersBo.class);
        PageVo pageVo = poorTeenagersService.pageQuery(bo);
        List data = pageVo.getData();
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateStringConverter())
                .create();
        String json = gson.toJson(data);

        JsonElement element = gson.fromJson(json, JsonElement.class);
        JsonObject o = new JsonObject();
        o.add("c", element);
        o.addProperty("orgName", (String) request.getSession().getAttribute(LoginInfo.ORG_NAME));
        String disposition = null;//
        try {
            disposition = "attachment;filename=" + URLEncoder.encode("贫困青少年数据.xlsx", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition", disposition);
        try {
            new ExportEngine().export(response.getOutputStream(), this.getClass().getClassLoader().getResourceAsStream("poorTeenagers.xlsx"), o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/exportInfo", params = "id", method = RequestMethod.GET)
    public void exportInfo(@RequestParam String id, HttpServletResponse response) {
        PoorTeenagersVo vo = poorTeenagersService.findById(id);
        Gson gson = new GsonBuilder().registerTypeAdapter(Date.class, new DateStringConverter("yyyy年MM月dd日"))
                .create();
        JsonObject o = new JsonObject();
        o.addProperty("name", vo.getName());
        o.addProperty("sexName", vo.getSexName());
        o.addProperty("age", vo.getAge());
        o.addProperty("reason", vo.getReason());
        o.addProperty("mzName", vo.getMzName());
        o.addProperty("zzmmName", vo.getZzmmName());
        o.addProperty("birthday", new SimpleDateFormat("yyyy.MM.dd").format(vo.getBirthday()));
        o.addProperty("phone", vo.getPhone());
        o.addProperty("qq", vo.getQq());
        o.addProperty("healthName", vo.getHealthName());
        o.addProperty("idCard", vo.getIdCard());
        o.addProperty("interest", vo.getInterest());
        o.addProperty("orgName", vo.getOrgName());
        o.addProperty("school", vo.getSchool());
        o.addProperty("classes", vo.getClasses());
        o.addProperty("parentName", vo.getParentName());
        o.addProperty("incomeName", vo.getIncomeName());
        o.addProperty("address", vo.getAddress());
        o.addProperty("content", vo.getContent());
        String picture = vo.getPicture();
        boolean hasFile = AttachmentProvider.getFile(picture) != null;
        if (picture != null && hasFile) {
            o.addProperty("picture", AttachmentProvider.getFile(picture).getAbsolutePath());
        }
        List<CondoleVo> vos = condoleService.queryByTeenager(id);
        if (vos != null && vos.size() > 0) {
            JsonElement element = gson.fromJson(gson.toJson(vos), JsonElement.class);
            o.add("c", element);
        }
        String disposition = null;//
        try {
            disposition = "attachment;filename=" + URLEncoder.encode("贫困青少年信息-" + vo.getName() + ".xlsx", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-disposition", disposition);
        try {
            new ExportEngine().export(response.getOutputStream(), this.getClass().getClassLoader().getResourceAsStream("poorTeenagersInfo.xlsx"), o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/analysis", params = "year", method = RequestMethod.GET)
    public void analysis(@RequestParam int year, HttpServletResponse response) {
        List<Object[]> vos = poorTeenagersService.analysisTeenagers(year);
        GsonUtils.printData(response, vos);
    }

    @ResponseBody
    @RequestMapping(value = "/delete", params = {"ids"}, method = RequestMethod.DELETE)
    public void deleteByIds(@RequestParam String ids, HttpServletResponse response) {
        String[] idArr = ids.split(",");
        poorTeenagersService.deleteByIds(idArr);
        GsonUtils.printSuccess(response);
    }

}

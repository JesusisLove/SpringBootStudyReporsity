package com.liu.springboot04web.controller;
/* EmployeeController
* 专门用来处理与员工相关的请求
*
* */

import com.liu.springboot04web.bean.BankKouzaMst;
import com.liu.springboot04web.bean.KojinKeiyakuMst;
import com.liu.springboot04web.dao.KojinKeiyakuMstDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class KojinKeiyakuMstController {

    @Autowired
    KojinKeiyakuMstDao kojinKeiyakuMstDao;

    // 点击sidebar里的【Bazel 口座管理】按钮，查询所有银行口座信息，并跳转到银行口座列表显示页面
    @GetMapping("/kojinkeiyakuall") //👈dashboard.html页面发来的请求（因为是GET，所以是一个查询请求）
    public String list(Model model) {
        Collection<KojinKeiyakuMst> kojinKeiyakuMstCollection = kojinKeiyakuMstDao.getInfoList();

        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("infoList", kojinKeiyakuMstCollection);
        return "kojinkeiyaku/kojinkeiyakulist";
    }

    // 2020/07/30 当点击【口座添加】按钮时，来到口座添加页面
    @GetMapping("/kojinkeiyaku") //👈list.html页面，点击【口座添加】按钮发来的请求（因为是GET，所以是一个查询请求）
    public String toInfoAdd(Model model) {

        // 来到口座添加页面
        return "kojinkeiyaku/kojinkeiyaku_add_update";
    }

    @PostMapping("/kojinkeiyaku") //👈addemp.html页面，点击【添加】按钮发来的请求（因为是POST，所以是一个追加请求）
    public String excuteInfoAdd(KojinKeiyakuMst kojinKeiyakuMst) {
        System.out.println("" + kojinKeiyakuMst);

        // 执行口座保存操作
        kojinKeiyakuMstDao.save(kojinKeiyakuMst);
        // 重定向到员工列表显示页面
        return "redirect:/kojinkeiyakuall";
    }

    // 2020/07/31 在口座列表显示页面里点击【编辑】按钮，抽取银行口座基本信息，并来到修改银行口座页面
    @GetMapping("/kojinkeiyaku/{id}") //👈addemp.html页面，点击【编辑】按钮发来的请求（因为是GET，所以是一个查询请求，而且还带了口座id参数）
    public String toInfoEdit(@PathVariable("id") String id,Model model) {
        // 因为查询的银行口座信息要在页面上回显，所以将取得的信息收纳在model里面
        KojinKeiyakuMst kojinKeiyakuMst = kojinKeiyakuMstDao.getInfoById(id);
        // 放在请求域中进行共享，使得可以在页面那里取得这些信息
        model.addAttribute("selectedinfo", kojinKeiyakuMst);

        return "kojinkeiyaku/kojinkeiyaku_add_update";
    }

    // 2020/07/31 在修改银行口座基本信息页面里，点击【修改】按钮，执行银行口座基本信息更新操作
    @PutMapping("/kojinkeiyaku")
    public String excuteInfoEdit(@ModelAttribute KojinKeiyakuMst kojinKeiyakuMst) {
        kojinKeiyakuMstDao.save(kojinKeiyakuMst);
        return "redirect:/kojinkeiyakuall";
    }

    // 2020/08/01 在银行口座基本信息列表显示页面里点击【删除】按钮，执行该口座基本信息删除操作
    @DeleteMapping("/kojinkeiyaku/{id}")
    public String excuteInfoDelete(@PathVariable("id") String id) {
        System.out.println("删除了银行口座的数据" );
        kojinKeiyakuMstDao.delete(id);
        return "redirect:/kojinkeiyakuall";
    }

}

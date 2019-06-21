package com.service.impl;
import com.dao.MessageMapper;
import com.dao.ProductionMapper;
import com.pojo.Message;
import com.pojo.Production;
import com.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class ProductionServiceImp implements ProductionService {
    @Autowired
    ProductionMapper productionMapper;
    @Autowired
    MessageMapper messageMapper;
    List ids=new ArrayList();
    List list5=new ArrayList();
    List list9=new ArrayList();
    public List selectone(){
        return productionMapper.selectOne();
    }
    @Override
    public List selectByParent(Integer id){
        List list=productionMapper.selectByParentId(id);
        List list2=new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Production production = (Production) list.get(i);
                Integer j = production.getId();
                List list1 = productionMapper.selectByParentId(j);
                if (list1 != null) {
                    for (int k = 0; k < list1.size(); k++) {
                        Production production1 = (Production) list1.get(k);
                        Integer f = production1.getId();
                        List list3 = productionMapper.selectByParentId(f);
                        if (list3.size() == 0) {
                            list2.add(f);

                        }

                    }

                }
            }
            return productionMapper.selectById (list2);
    }
@Override
//查询除了所有二三级
    public List<Production> selectByPid(Integer id){

        List <Production>Title=productionMapper.selectByParentId(id);
        if (Title.size()!=0) {
            List pp=new ArrayList();
            for (Production title : Title) {
                Integer parent_id = title.getId();
                pp.add(parent_id);
                list9.add(parent_id);
                selectByPid(parent_id);
            }


        }else {
            return null;
        }
    return list9;
    }
    @Override
    public List listid(Integer id){
        List<Production> list=productionMapper.selectByParentId(id);
        if(list !=null){
            for (int i=0;i<list.size();i++){
                List list1=new ArrayList();
                list1.add(list.get(i).getId());
                ids.add(list.get(i).getId());
                Iterator iterator=list1.iterator();
                while (iterator.hasNext()){
                    Integer list6=(Integer) iterator.next();
                    listid(list6);
                }
            }
        }
        else {return null;}
        return ids;
    }

//    @Override
//    public List listid(Integer id){
//        List list1=new ArrayList();
//        List <Production>Title=productionMapper.selectByParentId(id);
//        if(Title !=null){
//            for (Production i:Title){
//
//                list1.add(i.getId());
//                list5.add(i.getId());
//
//                Iterator production = list1.iterator ();
//                while ( production.hasNext()){
//                    Integer list0=(Integer) production.next();
//                    listid (list0);
//
//                }
//            }
//        }
//        return list5;
//    }

@Override
//写死的方法通过一级查出所有的作品
    public List selectThree(Integer id) {
    List<Production> select = productionMapper.selectByParentId(id);
    List list1 = new ArrayList();
    List list3 = new ArrayList();
    for (Production list : select) {
        Integer pid = list.getId();
        list1.add(pid);
        List<Production> select1 = productionMapper.selectByParentId(pid);
        for (Production list4 : select1) {
            Integer pid1 = list4.getId();
            list3.add(pid1);
        }

    }
    return productionMapper.selectById(list3);
}
@Override
    public List selectByParent1(Integer id){
// 查出所有一级标题id
        List title1 = productionMapper.selectall();
// 查看当前id是否在一级标题里面
        Integer cond = title1.indexOf(id);
        if(cond <= 0){
//一级标题时查二级标题
            List<Production>title2 = productionMapper.selectByParentId(id);
// 三级标题放在这个list
            List title3 = new ArrayList();
            List title4=new ArrayList();
            for (Production id1:title2) {
// 通过二级标题id查出三级
                Integer arr =id1.getId();
                title3.add(arr);
            }
            List<Production> pid=productionMapper.selectById(title3);
            for (Production p:pid) {
                Integer w=p.getId();
                title4.add(w);
            }
            return productionMapper.selectById(title4);
        }else {
            List title3 = productionMapper.selectByParentId(id);
            return title3;
        }
    }
    //查询一级与二级
    @Override
    public List selectAll(){
        List<Production> All=productionMapper.selectAll();
        List list1=new ArrayList();
        for (Production list:All) {
            Integer ids=list.getParentId();
            list1.add(ids);
        }
        List l= productionMapper.selectByListId(list1);
        return l ;
    }
    //二级查询三级
    @Override
    public List selectTwo(Integer id){
        return productionMapper.selectByParentId(id) ;
    }

}

package com.myshop.goods.dao;

import com.myshop.goods.vo.GoodsVO;
import com.myshop.goods.vo.ImageFileVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("goodsDAO")
public class GoodsDAOImpl implements GoodsDAO {
    @Autowired
    private SqlSession sqlSession;

    public List<GoodsVO> selectGoodsList(String goodsStatus) throws DataAccessException {
        List<GoodsVO> goodsList=(ArrayList)sqlSession.selectList("mapper.goods.selectGoodsList",goodsStatus);
        return goodsList;
    }

    public List<String> selectKeywordSearch(String keyword) throws DataAccessException {
        List<String> list=(ArrayList)sqlSession.selectList("mapper.goods.selectKeywordSearch",keyword);
        return list;
    }

    public GoodsVO selectGoodsDetail(String goods_id) throws DataAccessException {
        GoodsVO goodsVO=(GoodsVO)sqlSession.selectOne("mapper.goods.selectGoodsDetail",goods_id);
        return goodsVO;
    }

    public List<ImageFileVO> selectGoodsDetailImage(String goods_id) throws DataAccessException {
        List<ImageFileVO> imageList=(ArrayList)sqlSession.selectList("mapper.goods.selectGoodsDetailImage",goods_id);
        return imageList;
    }

    public List<GoodsVO> selectGoodsBySearchWord(String searchWord) throws DataAccessException {
        ArrayList list=(ArrayList)sqlSession.selectList("mapper.goods.selectGoodsBySearchWord",searchWord);
        return list;
    }
}

package com.ssafy.whereismyhome.board.service;

import com.ssafy.whereismyhome.board.model.BoardDetailDto;
import com.ssafy.whereismyhome.board.model.BoardListDto;
import com.ssafy.whereismyhome.board.model.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardMapper boardMapper;

    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    @Override
    public int writeArticle(BoardDetailDto dto) throws SQLException {
        return boardMapper.writeArticle(dto);
    }

    @Override
    public List<BoardListDto> getNotices(String searchBy, String searchKeyword, String orderBy) throws SQLException {
        return boardMapper.getNotices(searchBy, searchKeyword, orderBy);
    }

    @Override
    public List<BoardListDto> getCommunityArticles(String dongCode, String searchBy, String searchKeyword, String orderBy) throws SQLException {
        return boardMapper.getCommunityArticles(dongCode, searchBy, searchKeyword, orderBy);
    }

    @Override
    public BoardDetailDto getArticleById(int boardId) throws SQLException {
        return boardMapper.getArticleById(boardId);
    }

    @Override
    public int updateArticleById(BoardDetailDto dto) throws SQLException {
        return boardMapper.updateArticleById(dto);
    }

    @Override
    public int deleteArticleById(int boardId) throws SQLException {
        return boardMapper.deleteArticleById(boardId);
    }
}
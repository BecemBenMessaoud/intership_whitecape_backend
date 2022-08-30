package com.whitecape.services;

import com.whitecape.entities.Article;

public interface ArticleService {

    void storePicture(Article article);
    Article acceptArticle (long articleId);
    Article refuseArticle (long articleId);
}

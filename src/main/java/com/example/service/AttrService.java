package com.example.service;

import com.example.model.Attr;

import java.util.List;

public interface AttrService extends CURDService<Attr> {
    List<Attr> getByFK(long id);
}

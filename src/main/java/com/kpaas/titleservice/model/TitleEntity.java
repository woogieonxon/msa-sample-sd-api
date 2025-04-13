package com.kpaas.titleservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "title_data")
@Getter
@Setter
@NoArgsConstructor
public class TitleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long no;

    public String data1;
    public String data2;
}

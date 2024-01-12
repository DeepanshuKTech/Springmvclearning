package com.kapoor.springmvcpractice.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "clubs")
@Entity
public class club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String photourl;
    private String content;
    @CreationTimestamp
    private LocalDateTime createtimestamp;
    @UpdateTimestamp
    private LocalDateTime updateTime;

}

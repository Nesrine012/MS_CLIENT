package entity;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="Client_table")
@Builder(toBuilder = true)
public class ClientEntity {

@Id
@Column
    private UUID id;
@Column
    private String nom;

@Column
    private String e_mail;

@Column
    private String adresse;










}

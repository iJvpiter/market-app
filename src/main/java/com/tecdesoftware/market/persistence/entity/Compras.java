package com.tecdesoftware.market.persistence.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "compras")

public class Compras {
    @Id
    //Valor único autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id_compra")
    private Integer idCompra;

    @Column (name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column (name = "medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;

}

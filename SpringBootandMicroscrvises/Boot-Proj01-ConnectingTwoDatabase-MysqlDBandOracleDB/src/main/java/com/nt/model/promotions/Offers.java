package com.nt.model.promotions;

import java.time.LocalDateTime;

import org.hibernate.annotations.Tables;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="MDS_OFFERS")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Offers {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer offerId;
	@NonNull
	private String offerName;
	@NonNull
	private String offerCode;
	@NonNull
	Double discountPercentage;
	@NonNull
	private LocalDateTime expirtyDate;

}